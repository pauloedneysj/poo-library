public class Author {
        private String name;
        private String dateOfBirth;
        private String nationality;
        private String bibliography;
        public Author (String name, String dateOfBirth, String nationality, String bibliography){
                this.name = name;
                this.dateOfBirth = dateOfBirth;
                this.nationality = nationality;
                this.bibliography = bibliography;
        }
        public String getName(){ return name; }
        public String getDateOfBirth(){
                return dateOfBirth;
        }
        public String getNationality(){
                return nationality;
        }
        public String getBibliography(){
                return bibliography;
        }
        @Override
        public String toString(){
                return String.format(
                        "\nTitle: %s" +
                                "\nNome: %s " +
                                "\nData de nascimento: %s " +
                                "\nNacionalidade: %s " +
                                "\nBibliografia: %s ", name, dateOfBirth, nationality, bibliography
                );
        }
}
