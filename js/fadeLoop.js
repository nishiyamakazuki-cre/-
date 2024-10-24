/**
 * 
 */
// JavaScriptファイル (fadeLoop.js)

// フェードイン・フェードアウトを繰り返す関数
function fadeLoop(element) {
	// 最初にフェードインを適用
	element.classList.add('fade-in');

	// 2秒後にフェードアウトに切り替える
	setTimeout(function() {
		element.classList.remove('fade-in');
		element.classList.add('fade-out');
	}, 1000); // 2秒間フェードイン後にフェードアウト

	// 4秒後に再度フェードインに切り替える
	setTimeout(function() {
		element.classList.remove('fade-out');
		element.classList.add('fade-in');
	}, 2000); // フェードアウトが終わったら再びフェードイン
}

// フェードの繰り返しを開始する
function startFadeLoop() {
	const element = document.getElementById('content');
	setInterval(function() {
		fadeLoop(element);
	}, 2000); // 4秒ごとにフェードを繰り返す
}
