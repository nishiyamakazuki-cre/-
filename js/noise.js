document.getElementById('triggerButton').addEventListener('click', function() {
	// �{�^�����\���ɂ���
	this.style.display = 'none';

	// GIF��\��
	const gifContainer = document.getElementById('gifContainer');
	gifContainer.classList.remove('hidden');

	// ��莞�Ԍ��GIF���\���ɂ��A�|�����\������
	setTimeout(() => {
		gifContainer.classList.add('hidden');
		const imageContainer = document.getElementById('imageContainer');
		imageContainer.classList.remove('hidden');
	}, 3000); // 3�b��ɐ؂�ւ�
});