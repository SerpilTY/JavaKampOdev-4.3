package Concretes;

import Abstracts.PlayerCheckService;
import Abstracts.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService {

	private PlayerCheckService _playerCheckService;

	public PlayerManager(PlayerCheckService _playerCheckService) {
		super();
		this._playerCheckService = _playerCheckService;
	}

	@Override
	public void signIn(Player player) {
		System.out.println("Giriş Başarılı: " + player.getFirstName() + " " + player.getLastName());

	}

	@Override
	public void signUp(Player player) {
		System.out
				.println("Kaydınız Başarı ile oluşturulmuştur: " + player.getFirstName() + " " + player.getLastName());

	}

	@Override
	public void editProfile(Player player) {
		System.out.println("Profiliniz düzenlenmiştir :" + player.getFirstName() + " " + player.getLastName());
	}

	@Override
	public void deleteProfile(Player player) {
		System.out.println("Profiliniz silinmiştir :" + player.getFirstName() + " " + player.getLastName());

	}

}
