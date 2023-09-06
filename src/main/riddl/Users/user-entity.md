This entity represents an individual User. A Member entity stores all the 
information about that entity. 

Users can be in the following states:
* Active - active user in able to do things according to roles
* Inactive - a user who has not been active for a period of time (TBD)
* Suspended - a user who's account has been suspended due to violations of
  user agreements or similar reasons. Suspended user may be reinstated by
  an Admin user once reparations have been made.
* Terminated - a user who has exercised their "right to be forgotten". In this
  state, the unique Id is retained but all other information is removed.

Each UserId belongs to an AuthTenant, and each UserRole entity holds a `Map` keyed by
Roles with values supplying data relevant to that role.

In keycloak, the ID of the AuthTenant will correspond to a real Tenant in the system
except for a single AuthTenant meant to hold roles of Users who are not Members of a Tenant.
In this service, we will use an `Option` set to `None` for the generic AuthTenant.

Keycloak integration is still TBD, but essentially for every command that comes to Gateway,
Keycloak will be called to verify credentials and then this service will be called to
verify that the user has permission to perform the command based on their role.
