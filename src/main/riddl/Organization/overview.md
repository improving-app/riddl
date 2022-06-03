The Organization bounded context is responsible for the definition of various organizational entities, the relationships between organizations, and Membership within the organizations. There are two types of organizations: BaseOrganizations and SubOrganizations. The BaseOrganization has no parent and is the financially responsible entity. There is exactly one BaseOrganization within the an organizational structure. (Improving.App at large is designed as a multi-tenant system so there could be multiple BaseOrganizations defined, but there is no relationship between BaseOrganizations). Licensing and processing fees are paid by the BaseOrganization and revenue from sales activities are paid back to the BaseOrganization (who may decide if/how to distribute those funds to their SubOrganizations). Every other Organization within the structure is necessarily a SubOrganization by definition. 

While technically speaking, there are only these two kinds of Organizations (BaseOrganization and SubOrganization), for the remainder of this document we will either use organization generically or will use other terms to make clear the "roles" of organizations in various contexts. If the organization type needs to be made explicit we will use either BaseOrganization or SubOrganization accordingly.

Parent Organization and Child Organization are useful terms to describe the relationship between two organizations. Organizations are arranged in a tree-like structure with the BaseOrganization as the superset of all SubOrganizations that are defined under it. A child organization is a subset of a parent organization. For example, you may have a Football team organization (parent), that has child organizations of Varsity, Junior Varsity, Sophomore, and Freshman teams. A Parent Organization could be a Child to yet another Organization. Another way to say this is, being a Parent Organization does not necessarily mean it is also a BaseOrganization.

Organizations can be in one of the following states:
* Draft: an organization that is in process of being defined.
* Active: an organization that is fully defined and currently in use.
* Inactive: an organization that may be fully defined but is not in use. This state is typically self induced, for example, the school year ends.
* Suspended: an organzation that is non-functioning because of violation of terms, non-payment, or similar reason. If these concerns are remedied the organizaton may be moved back to active status by a BaseOrganization Admin.
* Terminated: an organization that is non-functioning and will not or cannot be brought back to active status. Typically, only the organization ID (possibly Name as well) is retained to maintain internal consistency.

Every organization must have one or more Members defined within it. Members are people, known users, who use the system. Membership within an organization implies membership in that organization's parent organization - all the way back to the BaseOrganization. Membership in sibling organizations is not assumed and must be made explicit if that is desired. In order to be assigned as an Admin of an organization you must first be a Member of that organization.

Guests are similar to Members in that they use the system to view public events and make purchases. However, Guests are anonymous within the system. That is, there is no personal information retained. Guests may not maintain details like payment methods to ease purchases. If an guest makes two purchases in the system each of those purchases are associated with two distinct guest records - one for each purchase. The individual must enter payment information with each of those purchases. Guests may not be members of an organization as there is no retained entity with which to assign the membership.

Members can be in the following states:
* Active - active member in good standing
* Inactive - a member who has not been active for a period of time (TBD)
* Suspended - a member who's account has been suspended due to violations of user agreements or similar reasons. Suspended members may be reinstated by an Admin once reparations have been made.
* Terminated - a member who has exercised their "right to be forgotten"

Additionally, in a high school setting, the following member types are supported:
* FacultyStaff - Teachers and administrative support employees within the organization
* Student - students at the organization
* Vendor - an entity authorized to sell goods at organization events
* Sponsor - an entity who contributes monitary means or other material assets to the Organization, possibly in exchange for recognition (limited advertising) at organization events
* General - the default member type
* Alumni - A member who at one time was a student or Faculty/Staff member at the organization
* Parent - A member who has legal guardianship over an active student at the organization

Guests maintain only their default state.