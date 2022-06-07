SubOrganizations make up the bulk of the organizational structure. If the BaseOrganization is the root, the SubOrganizations are the branches and leaves. Each SubOrganization must have a parent. They may also have SubOrganizations as children. 

Each SubOrganization must have at least one Member who is also an Admin. Admins must be explicitly named for each organization they are an administrator for. Admin abilities in child organizations is not assumed (the exception being named admins in the BaseOrganization have admin abilities across the entire organizational structure). 

Members of an organization are also members of that organization's parent organization - all the way back to the BaseOrganization. Membership in sibling organzations is not assumed. Only Admins in the BaseOrganization may do things that affect license fees and service charges for the organization as a whole.

For a broad overview of Organizations, Members, and Guests please see the definition for the Organization Bounded Context.

//TODO: Provide link to Organization BC overview document.