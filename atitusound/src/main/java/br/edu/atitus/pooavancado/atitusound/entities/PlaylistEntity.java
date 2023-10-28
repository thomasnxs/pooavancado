package br.edu.atitus.pooavancado.atitusound.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_playlist")
public class PlaylistEntity extends GenericEntity {

	private boolean public_share;

	public boolean isPublic_share() {
		return public_share;
	}

	public void setPublic_share(boolean public_share) {
		this.public_share = public_share;
	}
	
}
