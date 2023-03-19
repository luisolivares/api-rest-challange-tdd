package ar.com.sancorsalud.crm.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public abstract class TestUtils {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private static List<JsonNode> parseJsonArray(String jsonString) {
        try {
            return (List) OBJECT_MAPPER.readValue(jsonString, new TypeReference<List<JsonNode>>() {
            });
        } catch (IOException var2) {
            return null;
        }
    }

    private static List<JsonNode> sortJsonArray(List<JsonNode> jsonArray) {
        return (List) jsonArray.stream().sorted(Comparator.comparing(JsonNode::toString)).collect(Collectors.toList());
    }

    private static boolean preliminaryJsonArrayMatching(List<JsonNode> response, List<JsonNode> expected) {
        if (response != null && expected != null) {
            return response.size() == expected.size();
        } else {
            return false;
        }
    }

    private static boolean jsonArrayMatching(List<JsonNode> response, List<JsonNode> expected, boolean reportMismatch) {
        for (int i = 0; i < response.size(); ++i) {
            JsonNode expectedJson = (JsonNode) expected.get(i);
            JsonNode responseJson = (JsonNode) response.get(i);
            if (!expectedJson.equals(responseJson)) {
                if (reportMismatch) {
                    log.error("\u001b[0;31mExpected <" + expectedJson.toString() + "> but was <" + responseJson.toString() + "> (at index " + i + ")." + "\u001b[0m");
                }

                return false;
            }
        }

        return true;
    }


    public static boolean matchJsonArray(String responseString, String expectedString, boolean reportMismatch) {
        List<JsonNode> response = parseJsonArray(responseString);
        List<JsonNode> expected = parseJsonArray(expectedString);
        boolean preliminary = preliminaryJsonArrayMatching(response, expected);
        return !preliminary ? false : jsonArrayMatching(response, expected, reportMismatch);
    }

    public static boolean matchJson(String responseString, String expectedString, boolean reportMismatch) {
        try {
            JsonNode response = OBJECT_MAPPER.readTree(responseString);
            JsonNode expected = OBJECT_MAPPER.readTree(expectedString);
            if (!response.equals(expected)) {
                if (reportMismatch) {
                    log.error("\u001b[0;31mExpected <" + expectedString + "> but was <" + responseString + ">." + "\u001b[0m");
                }

                return false;
            } else {
                return true;
            }
        } catch (IOException var5) {
            return false;
        }
    }

}
