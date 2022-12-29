package guru.springframework.springrestclientexamples.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Billing implements Serializable {
    private Card card;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
