package tests.lesson12;

import com.google.gson.annotations.SerializedName;

public class TestPropertyModel {
    private String url = "test-yandex.ru";
    private String port = "443";
    private String protocol = "https";

    @SerializedName("is_remote")
    private String isRemote = "true";

    private String browser = "opera";

    public TestPropertyModel() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TestPropertyModel that = (TestPropertyModel) o;

        if (url != null ? !url.equals(that.url) : that.url != null) {
            return false;
        }
        if (port != null ? !port.equals(that.port) : that.port != null) {
            return false;
        }
        if (protocol != null ? !protocol.equals(that.protocol) : that.protocol != null) {
            return false;
        }
        if (isRemote != null ? !isRemote.equals(that.isRemote) : that.isRemote != null) {
            return false;
        }
        return browser != null ? browser.equals(that.browser) : that.browser == null;
    }

    @Override
    public int hashCode() {
        int result = url != null ? url.hashCode() : 0;
        result = 31 * result + (port != null ? port.hashCode() : 0);
        result = 31 * result + (protocol != null ? protocol.hashCode() : 0);
        result = 31 * result + (isRemote != null ? isRemote.hashCode() : 0);
        result = 31 * result + (browser != null ? browser.hashCode() : 0);
        return result;
    }
}
