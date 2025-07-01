package entities;

public class User {
    private String name;
    private String email;
    private String cpf;

    public User(String name, String email, String cpf) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
    }

    public String getCpf() {
        StringBuilder sb = new StringBuilder();

        if (cpf.length() == 11 && cpf != null) {
            sb.append(cpf.substring(0, 3)).append('.').append(cpf.substring(3, 6)).append('.').append(cpf.substring(6, 9)).append('-').append(cpf.substring(9));

            return sb.toString();
        } else {
            throw new IllegalArgumentException("CPF inválido. Deve conter 11 dígitos.");
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
