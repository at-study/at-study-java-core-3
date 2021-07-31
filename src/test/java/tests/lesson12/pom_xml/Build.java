package tests.lesson12.pom_xml;

import java.util.List;

public class Build {
    private List<Plugin> plugins;

    public Build() {
    }

    public Build(List<Plugin> plugins) {
        this.plugins = plugins;
    }

    public List<Plugin> getPlugins() {
        return plugins;
    }
}
