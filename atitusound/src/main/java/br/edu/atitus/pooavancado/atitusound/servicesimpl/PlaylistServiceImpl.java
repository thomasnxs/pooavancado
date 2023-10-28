package br.edu.atitus.pooavancado.atitusound.servicesimpl;

public class PlaylistServiceImpl {
	
	@Service

	public class PlaylistServiceImpl implements PlaylistService{
		
		private final PlaylistRepository repository;
		
		public PlaylistServiceImpl(PlaylistRepository repository) {
			super();
			this.repository = repository;
		}

		@Override
		public GenericRepository<PlaylistEntity> getRepository() {
			return repository;

}
