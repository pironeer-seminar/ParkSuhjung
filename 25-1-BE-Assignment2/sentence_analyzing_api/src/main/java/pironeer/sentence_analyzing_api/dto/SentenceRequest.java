package pironeer.sentence_analyzing_api.dto;

import jakarta.validation.constraints.NotBlank;

public class SentenceRequest {

    @NotBlank(message = "문장은 필수 입력 값입니다.")
    private String sentence;

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
