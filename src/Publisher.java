public class Publisher {
private String name;
private String address;
private String telephone;
    public Publisher(String name, String address, String telephone){
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getTelephone(){
        return telephone;
    }
    @Override
    public String toString(){
        return String.format(
                        "\nNome: %s " +
                        "\nEndereço: %s " +
                        "\nTelefone: %s ", name, address, telephone
                );
    }
}
