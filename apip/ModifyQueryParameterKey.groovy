def prevKey = 'dip'
def newKey = 'pid'
def queryParams = (Map)context.apiRequest.getQueryParams()

// Change key of query parameter when target parameter is set
if( queryParams != null && queryParams.containsKey(prevKey) != null) {
    def val = (String)((List)queryParams.get(prevKey)).get(0);
    context.serviceRequest.withoutQueryParam(prevKey)
    context.serviceRequest.setQueryParam(newKey, val)
}
else {
    // No operation when no query parameter is set or specified parameter is not target one.
}
