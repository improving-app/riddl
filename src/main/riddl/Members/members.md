Members are people, known users, who use the system. Membership within an organization implies membership in that organization's parent organization - all the way back to the BaseOrganization. Membership in sibling organizations is not assumed and must be made explicit if that is desired. In order to be assigned as an Admin of an organization you must first be a Member of that organization.

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
* Fan - A member who is no otherwise associated to the organization but wants to support it.

Organizational membership is necessary to view details of private organizations or events that are private to the sponsoring organization. User type may further restrict details that are visible within the organzaiton.

Improving.app, the Organizations the member belongs to, and the user themselves may persist certain information about the member. For example, the member may save personal information, payment methods to ease transactions, and so on. An organization may track a member's attendance to events and anonymized demographic data. And so on.

Members may act as an Admin for an organization that they belong to within limits. For example, it may be defined that only a Member of type FacultyStaff may be an admin for the BaseOrganization. Maybe it is defined that Vendors, and Sponsors, may not be an Admin for any organization. A member may have several types simultaneously. For example, a Member may be both FacultyStaff and a Parent at the same time. All members by default are General Members.