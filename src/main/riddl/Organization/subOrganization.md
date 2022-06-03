There are two kinds of Organizations. A ResponsibleOrganization and Organization. They are defined as follows:

type ResponsibleOrgId is Id(ResponsibleOrganization)
type OrganizationId is Id( Organization )
type OrganizationType is one of {ResponsibleOrganization, Organization}

//Organization Details        
type OrganizationInfo is {
    name: String, //i.e. Provo High School
    shortName: String, //i.e. PHS
    address: Address,
    childOrganizations: OrganizationId*,
    isPrivate: Boolean
    //calendar: Calendar
}
type BillingAccount: String
type PaymentAccount: String

 entity ResponsibleOrganization is {
    oid: ResponsibleOrgId,
    orgDetails: OrganizationInfo,
    url: URL,
    billingAccount: Account,
    paymentAccount: Account,
    availableVenues: Venue*
}

entity Organization is {
    oid: OrganizationId,
    orgDetails: OrganizationInfo,
    parentOrganization: OrganizationType
}

A ResponsibleOrganization is one that has no parent. A ResponsibleOrganization is the responsible billing entity (how we get paid) and therefore has a BillingAccount. It may also have a PaymentAccount (how we get funds back to them i.e. revenue from store sales). 

Organizations are connected in a tree structure with the ResponsibleOrganization at the base/root. The relationships in this tree structure are  parent/child relationships. A child organization is a subset of a parent organization. For example, you may have a Football team organization (parent), that has child organizations of Varsity, Junior Varsity, Sophomore, Freshman. Members of an organization must be members of the parent organization(s) all the way back up the tree to the root organization. However, membership in sibling organizations is not automatically assumed. Member type may dictate how the Member interacts with the Organization. Parents may interact differently than a Student, for example.

A sponsoring organization is one that hosts an event. For example, the Football team is the sponsoring organization of a football game.

A participating organization is one that also participates in an event, but does not sponsor the event. For example, the Football team sponsors a football game, but the cheerleaders, drill team, marching band, and pep band participate in the event (perform at the event).

A supporting organization is one that assists the sponsoring organization in an event. For example, the AV club takes care of sound, communication, and lighting. The booster club runs the concession stand. The math club runs the statistics functions.

These distinctions are important when you start considering how you may distribute revenue from an event.

The difference between a supporting organization and a participating organization is probably one of semantics. A participating organization performs at the event. A supporting organization manages a function. Perhaps an organization may want to share revenue with a participating organization as a percentage of attendance, but engage with a supporting organization on a fee basis - for example, I will give the AV Club $100 to manage sound and lighting at my event.

Each organization must have one primary admin. This is the “super user” for that organization. The primary admin can perform all functions for an organization. Admins (not the primary admin) may not manage billing or payment accounts, may not create other admins, but otherwise can perform all other functions for an organization. (another line we may want to draw is only the primary admin can take action that affects billing for the root organization?). A primary admin may temporarily delegate their role to one other admin for the org (time bound - set as the delegation is made). (Question: during the time where a primary admin has delegated their role can they also act as a primary admin? In other words, would we allow two primary admins to operate at the same time?). An admin’s privileges does not cascade down the organizational tree. You must be a member of an organization in order to be an admin for the organization. Further, admins may be restricted by Member type. For example, it may be decided that a Student Member type cannot be an admin.

A preliminary organization is one that is not yet fully registered and active but is in process.

An active organization is one that is currently operating and is in good standing.

An inactive organization is one that is no longer operating (i.e. school year closed) of their own choice.

A suspended organization is one that has been stopped due to non-payment, or violation of an agreement, or similar reasons.

A terminated organization is one that we keep the oid to maintain system integrity but the rest of the identifiable information is purged.

A billing account is required for a root organization. This is how we get paid. A payment account is optional (but it is difficult to imagine a root organization that would not have one of these). This is how we distribute proceeds back to the root organization. Payments are made back to the root organization with attribution to the sponsoring and participating organizations. Payment attribution is also made to the store where the purchase was made. Payments are made daily when funds due exceed $X. If funds due are <$X those funds accrue in the next day’s payment until funds due >$X. When the organization stops their subscription all funds are paid regardless of total funds due. Payments contain a complete itemization of the transactions included in the payment (event, store, date/time of transaction, items purchased)

Question: should shortName be unique (no)? This could be useful for subdomains (no)? We should track short name

Question: is the idea of a root organization different enough that it is its own entity? Separate entity for a sub organization?