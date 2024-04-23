package br.com.fiap.motos.service;

import br.com.fiap.motos.dto.request.AcessorioRequest;
import br.com.fiap.motos.dto.response.AcessorioResponse;
import br.com.fiap.motos.entity.Acessorio;
import br.com.fiap.motos.repository.AcessorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcessorioService implements ServiceDTO <Acessorio, AcessorioRequest, AcessorioResponse> {


    @Autowired
    private AcessorioRepository repo;

    @Override
    public Acessorio toEntity(AcessorioRequest r) {

        return Acessorio.builder()
                .nome( r.nome() )
                .preco( r.preco())
                .build();

    }

    @Override
    public PessoaResponse toResponse(Pessoa e) {

        return PessoaResponse.builder()
                .id( e.getId() )
                .nome( e.getNome() )
                .sobrenome( e.getSobrenome() )
                .email( e.getEmail() )
                .nascimento( e.getNascimento() )
                .tipo( e.getTipo() )
                .build();
    }

    @Override
    public List<Pessoa> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Pessoa> findAll(Example<Pessoa> example) {
        return repo.findAll( example );
    }

    @Override
    public Pessoa findById(Long id) {
        return repo.findById( id ).orElse( null );
    }

    @Override
    public Pessoa save(Pessoa e) {
        return repo.save( e );
    }
}
