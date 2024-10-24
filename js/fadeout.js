// フェードアウト処理をまとめる関数
function fadeOutElement(element, callback) {
	element.classList.add('fade-out');
	setTimeout(callback, 1000); // 1秒後にコールバック実行
}

// 親要素に対して1つのイベントリスナーを設定（イベント委譲）
document.body.addEventListener('click', function(event) {
	// リンクがクリックされた場合のみ処理
	if (event.target.tagName === 'A' && event.target.hasAttribute('data-action')) {
		event.preventDefault(); // デフォルト動作を防ぐ

		// フェードアウトさせる要素
		const fadeElement = document.getElementById('fadeElement');

		// フェードアウト後にアクションを実行
		fadeOutElement(fadeElement, function() {
			const action = event.target.getAttribute('data-action');

			// アクションに応じた処理
			if (action === 'eat') {
				window.location.href = "http://localhost:8080/hamujiro/Main?action=eat";
			} else if (action === 'drink') {
				window.location.href = "http://localhost:8080/hamujiro/Main?action=drink";
			} else if (action === 'clean') {
				window.location.href = "http://localhost:8080/hamujiro/Main?action=clean";
			}
			else if (action === 'touch') {
				window.location.href = "http://localhost:8080/hamujiro/Main?action=touch";
			}
			else if (action === 'partTime') {
				window.location.href = "http://localhost:8080/hamujiro/Main?action=partTime";
			}
			else if (action === 'bathTime') {
				window.location.href = "http://localhost:8080/hamujiro/Main?action=bathTime";
			}
			else if (action === 'save') {
				window.location.href = "http://localhost:8080/hamujiro/Main?action=save";
			}
			// 必要に応じてリダイレクト
			// window.location.href = 'nextPage.jsp';
		});
	}
});
