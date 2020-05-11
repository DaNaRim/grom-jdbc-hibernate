package lesson4.homework.model;

import lesson4.homework.Exceptions.BadRequestException;

import java.util.HashSet;

public class Storage {
    private long id;
    private HashSet<File> files;
    private String[] formatsSupported;
    private String storageCountry;
    private long storageSize;
    private long freeSpace;

    public Storage(String[] formatsSupported, String storageCountry, long storageSize) throws BadRequestException {
        if (formatsSupported == null || formatsSupported.length == 0 || storageCountry == null ||
                storageCountry.equals("") || storageSize <= 0) {
            throw new BadRequestException("Fields are not filed correctly");
        }
        this.formatsSupported = formatsSupported;
        this.storageCountry = storageCountry;
        this.storageSize = storageSize;
        this.freeSpace = storageSize;
    }

    public Storage(long id, HashSet<File> files, String[] formatsSupported, String storageCountry, long storageSize, long freeSpace) {
        this.id = id;
        this.files = files;
        this.formatsSupported = formatsSupported;
        this.storageCountry = storageCountry;
        this.storageSize = storageSize;
        this.freeSpace = freeSpace;
    }

    public long getId() {
        return id;
    }

    public HashSet<File> getFiles() {
        return files;
    }

    public String[] getFormatsSupported() {
        return formatsSupported;
    }

    public String getStorageCountry() {
        return storageCountry;
    }

    public long getStorageSize() {
        return storageSize;
    }

    public long getFreeSpace() {
        return freeSpace;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFiles(HashSet<File> files) {
        this.files = files;
    }

    public void setStorageSize(long storageSize) {
        this.storageSize = storageSize;
    }
}