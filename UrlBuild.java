public class UrlBuild {
    public static String buildSearchUrl(String baseUrl, String params) {
        String formattedParams = "";
        if (params != null && !params.isEmpty()) {
            String[] paramArray = params.split("&");
            for (String param : paramArray) {
                String[] kvPair = param.split("=");
                if ("null".equals(kvPair[1])) {
                    continue;
                }
                formattedParams += (formattedParams.isEmpty() ? "" : "&") + kvPair[0] + "=" + kvPair[1];
            }
        }
        return baseUrl + ((baseUrl.contains("?") ? "&" : "?") + formattedParams); // проверка на наличие знака "?"
    }
}

