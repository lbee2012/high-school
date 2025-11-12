var slides = document.getElementsByClassName("slide")

console.log(slides)

var index = 0

function slideshow() {
    // ẩn tất cả hình ảnh
    for (var i = 0; i < slides.length; i++) {
        slides[i].style.display = "none"
    }

    // hiển thị ảnh đầu tiên
    slides[index].style.display = "block"
}

function first() {
    index = 0
    slideshow()
}

function next() {
    index += 1
    if (index > slides.length - 1) {
        index = 0
    }
    slideshow()
}

function back() {
    if (index > 0) {
        index -= 1
    } else {
        index = slides.length - 1
    }
    slideshow()
}

function last() {
    index = slides.length - 1
    slideshow()
}

function start() {
    interval = setInterval(next, 500)
}

function stop() {
    clearInterval(interval)
}

document.getElementById("first").addEventListener("click", first)
document.getElementById("next").addEventListener("click", next)
document.getElementById("back").addEventListener("click", back)
document.getElementById("last").addEventListener("click", last)
document.getElementById("start").addEventListener("click", start)
document.getElementById("stop").addEventListener("click", stop)

slideshow() // cái nhìn đầu tiên