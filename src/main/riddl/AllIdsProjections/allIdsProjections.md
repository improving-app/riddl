These projections are intended for use by the study, wherein tables will be queried for all entity IDs for which 
dependent entities will be created. The dependencies are as follows:
- organization creation required a tenantId
- event creation requires an organizationId in the field info.sponsoringOrg
- member creation can use an organizationId in the field info.organizationMembership, and will use it in the study
- product creation requires a storeId in the field 'store'
- order creation requires both SKU (in the field 'sku') and memberId (in the field creatingMember)