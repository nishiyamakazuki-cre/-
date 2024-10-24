/**
 * 
 */

const bgm = document.getElementById("bgm");

// ページがリロードされたり、リダイレクトする前に再生位置を保存
window.addEventListener('beforeunload', function() {
	localStorage.setItem("bgmTime", bgm.currentTime);
});

// ページが読み込まれた時に、以前の再生位置から再生を開始
window.addEventListener('DOMContentLoaded', function() {
	const savedTime = localStorage.getItem("bgmTime");
	if (savedTime !== null) {
		bgm.currentTime = savedTime;
	}
	bgm.play();  // 保存した位置から再生
});