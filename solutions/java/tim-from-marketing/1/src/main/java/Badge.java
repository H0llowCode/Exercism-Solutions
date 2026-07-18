class Badge {
    public String print(Integer id, String name, String department) {
        // 1. Format the ID portion safely
        String idPrefix = (id == null) ? "" : "[" + id + "] - ";
        
        // 2. Fallback to "OWNER" if department is missing
        String deptName = (department == null) ? "OWNER" : department.toUpperCase();
        
        // 3. Assemble and return the clean string
        return idPrefix + name + " - " + deptName;
    }
}
