
public class Notes {
           private int id;
           private String notes;
           private Long not_id;
        public Notes(int id, String notes, Long not_id) {
            this.id = id;
            this.notes = notes;
            this.not_id = not_id;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getNotes() {
            return notes;
        }
        public void setNotes(String notes) {
            this.notes = notes;
        }
        public Long getNot_id() {
            return not_id;
        }
        public void setNot_id(Long not_id) {
            this.not_id = not_id;
        }
        @Override
        public String toString() {
            return "Notes [id=" + id + ", notes=" + notes + ", not_id=" + not_id + "]";
        }
           

        
}
