package br.edu.atitus.pooavancado.atitusound.controllers;

import br.edu.atitus.pooavancado.atitusound.entities.PlaylistEntity;
import br.edu.atitus.pooavancado.atitusound.services.GenericService;
import br.edu.atitus.pooavancado.atitusound.services.PlaylistService;

public class PlaylistController extends GenericController<PlaylistEntity, PlaylistDTO>{

	private final PlaylistService service;
	
	public PlaylistController(PlaylistService service) {
		super();
		this.service = service;
	}

	@Override
	protected GenericService<PlaylistEntity> getService() {
		return service;
	}

	@Override
	protected PlaylistEntity convertdto2Entity(PlaylistDTO dto) {
		PlaylistEntity entidade = new PlaylistEntity();
		entidade.setName(dto.getName());
		entidade.setPublic_share(dto.getPublic_share());

		
		return entidade;
	}

}
