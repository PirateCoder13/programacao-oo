package ed04;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Controlador para gerenciar a lógica de negócios da agenda de contatos.
 * Manipula uma lista de contatos em memória.
 */
public class ControleContato {
    private List<Contato> contatos;

    /**
     * Construtor do ControleContato.
     * Inicializa la lista de contatos.
     */
    public ControleContato() {
        this.contatos = new ArrayList<>();
    }

    /**
     * Adiciona um novo contato à lista.
     * Verifica a unicidade do contato pelo seu identificador (CPF/CNPJ).
     * @param contato O contato a ser adicionado.
     * @return true se o contato foi adicionado com sucesso, false caso contrário (e.g., duplicado).
     * @throws IllegalArgumentException se o contato for nulo.
     */
    public boolean adicionar(Contato contato) {
        if (contato == null) {
            throw new IllegalArgumentException("Contato não pode ser nulo.");
        }
        // Validação de unicidade
        for (Contato c : contatos) {
            if (c.getIdentificador().equals(contato.getIdentificador())) {
                return false; // Contato já existe
            }
        }
        contatos.add(contato);
        return true;
    }

    /**
     * Remove um contato da lista com base no seu identificador (CPF/CNPJ).
     * @param identificador O CPF ou CNPJ do contato a ser removido.
     * @return true se o contato foi removido com sucesso, false caso contrário (e.g., não encontrado).
     */
    public boolean remover(String identificador) {
        if (identificador == null || identificador.trim().isEmpty()) {
            return false;
        }
        return contatos.removeIf(contato -> contato.getIdentificador().equals(identificador.trim()));
    }

    /**
     * Lista todos os contatos cadastrados.
     * @return Uma lista de todos os contatos.
     */
    public List<Contato> listar() {
        return new ArrayList<>(contatos); // Retorna uma cópia para evitar modificação externa direta
    }

    /**
     * Busca um contato pelo seu identificador (CPF/CNPJ).
     * @param identificador O CPF ou CNPJ do contato a ser buscado.
     * @return Um Optional contendo o contato se encontrado, ou Optional.empty() caso contrário.
     */
    public Optional<Contato> buscarPorIdentificador(String identificador) {
        if (identificador == null || identificador.trim().isEmpty()) {
            return Optional.empty();
        }
        return contatos.stream()
                       .filter(contato -> contato.getIdentificador().equals(identificador.trim()))
                       .findFirst();
    }

    /**
     * Atualiza os dados de um contato existente.
     * @param identificador O CPF ou CNPJ do contato a ser atualizado.
     * @param novoNome O novo nome para o contato.
     * @param novoTelefone O novo telefone para o contato.
     * @param novoEmail O novo email para o contato.
     * @return true se o contato foi atualizado com sucesso, false caso contrário.
     * @throws IllegalArgumentException se o novo nome for inválido.
     */
    public boolean atualizar(String identificador, String novoNome, String novoTelefone, String novoEmail) {
        Optional<Contato> contatoOpt = buscarPorIdentificador(identificador);
        if (contatoOpt.isPresent()) {
            Contato contatoParaAtualizar = contatoOpt.get();
            try {
                contatoParaAtualizar.setNome(novoNome); // Validação no setter
                contatoParaAtualizar.setTelefone(novoTelefone);
                contatoParaAtualizar.setEmail(novoEmail);
                return true;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return false; // Contato não encontrado
    }
}