The Organization bounded context is responsible for the definition of various organizational entities and the relationships between organizations. In this RIDDL definition we have only provided a single definition for Organization. However, as visualize Organization there are  two types of organizations: BaseOrganizations and SubOrganizations. The BaseOrganization has no parent and is the financially responsible entity. There is exactly one BaseOrganization within an organizational structure. (Improving.App at large is designed as a multi-tenant system so there could be multiple BaseOrganizations defined, but there is no relationship between BaseOrganizations). Licensing and processing fees are paid by the BaseOrganization and revenue from sales activities are paid back to the BaseOrganization (who may decide if/how to distribute those funds to their SubOrganizations). Every other Organization within the structure is necessarily a SubOrganization. 

For the remainder of this document we will either use Organization generically or we will provide a more specific term to make clear the "roles" of organizations in various contexts. For example, Parent Organization and Child Organization are useful terms to describe the relationship between two organizations. Organizations are arranged in a tree-like structure with the BaseOrganization at the base of that structure. A child organization is a subset of a parent organization. For example, you may have a Football team organization (parent), that has child organizations of Varsity, Junior Varsity, Sophomore, and Freshman teams. A Parent Organization could be a Child to yet another Organization. Another way to say this is, being a Parent Organization does not necessarily mean it is also a BaseOrganization.

Organizations can be in one of the following states:
* Draft: an organization that is in process of being defined.
* Active: an organization that is fully defined and currently in use.
* Inactive: an organization that may be fully defined but is not in use. This state is typically self induced, for example, the school year ends.
* Suspended: an organization that is non-functioning because of violation of terms, non-payment, or similar reason. If these concerns are remedied the organizaton may be moved back to active status by a BaseOrganization Admin.
* Terminated: an organization that is non-functioning and will not or cannot be brought back to active status. Typically, only the organization ID and Name are retained to maintain internal consistency.

Organizations can be public or private.

The differences are:
* Membership - to become a member of a private organization you must be invited or approved by an admin.
* Events - By default, events from private organizations are private. and events from public organizations are public. This can be changed at event creation.
* Event Searchability - Members of public organizations can find/be notified about public events from the organization or its children.  Only members of private organizations can find private events for those organizations
    * E.g. Hogwarts is a public base org,  HogWarts Sports Clubs is a public org, child of Hogwarts, Hogwarts Quidditch club is a private org child of Hogwarts Sports Clubs.
    * Quidditch practice is a private event created by the Hogwarts Quidditch club (organization) and is only visible to members of the Hogwarts Quidditch club.
    * Quidditch Game is a public event, created by the Hogwarts Quidditch club and is visible to all members of Hogwarts and children organizations - and is also findable by any member of any organization looking for public events from Hogwarts.