package org.eurekaclinical.registry.client.comm;


/**
*
* @author Dileep Gunda
*/
public class GroupConfig {
    public static final Section[] EMPTY_SECTION_ARRAY = new Section[0];

    public static class Section {

        private String id;
        private String displayName; 
 
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

    }
    private String id;
    private String displayName;
    private String ownerUsername;
    private boolean read;
    private boolean write;
    private boolean execute;

    public GroupConfig() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getOwnerUsername() {
        return ownerUsername;
    }

    public void setOwnerUsername(String ownerUsername) {
        this.ownerUsername = ownerUsername;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isWrite() {
        return write;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    public boolean isExecute() {
        return execute;
    }

    public void setExecute(boolean execute) {
        this.execute = execute;
    }



    @Override
    public String toString() {
        return "SourceConfig{" + "id=" + id + ", displayName=" + displayName + ", ownerUsername=" + ownerUsername + ", read=" + read + ", write=" + write + ", execute=" + execute + '}';
    }
}
