package domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "TB_MARCA")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marc_seq")
    @SequenceGenerator(name = "marc_seq", sequenceName = "seq_marc", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "Codigo", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "Nome", length = 50, nullable = false, unique = true)
    private String nome;

    @Column(name = "Pais", length = 50, nullable = false, unique = true)
    private String pais;

    @OneToMany(mappedBy = "marca")
    private List<Carro> carrosList;

    //#region Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Carro> getCarrosList() {
        return carrosList;
    }

    public void setCarrosList(List<Carro> carrosList) {
        this.carrosList = carrosList;
    }
    //#endregion Getters and Setters
}
