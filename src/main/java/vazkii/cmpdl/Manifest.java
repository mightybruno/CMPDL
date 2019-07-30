package vazkii.cmpdl;

import vazkii.cmpdl.Manifest.MinecraftData.Modloader;

import java.util.List;

class Manifest {

    MinecraftData minecraft;
    String manifestType;
    String manifestVersion;
    String name;
    String version;
    String author;
    int projectID;
    List<FileData> files;
    String overrides;

    String getForgeVersion() {
        for (Modloader loader : minecraft.modLoaders) {
            if (loader.id.startsWith("forge"))
                return loader.id.substring("forge-".length());
        }

        return "N/A";
    }

    static class MinecraftData {

        public String version;
        public List<Modloader> modLoaders;

        public static class Modloader {

            public String id;
            public boolean primary;

        }

    }

    static class FileData {
        public int projectID;
        public int fileID;
        public boolean required;

        @Override
        public String toString() {
            return projectID + "/" + fileID;
        }

    }
}
