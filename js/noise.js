document.getElementById('triggerButton').addEventListener('click', function() {
	// ボタンを非表示にする
	this.style.display = 'none';

	// GIFを表示
	const gifContainer = document.getElementById('gifContainer');
	gifContainer.classList.remove('hidden');

	// 一定時間後にGIFを非表示にし、怖い顔を表示する
	setTimeout(() => {
		gifContainer.classList.add('hidden');
		const imageContainer = document.getElementById('imageContainer');
		imageContainer.classList.remove('hidden');
	}, 3000); // 3秒後に切り替え
});