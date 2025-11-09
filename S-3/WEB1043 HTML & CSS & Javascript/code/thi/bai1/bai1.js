var slides = document.getElementsByClassName("slide")
var index = 0

function slideshow() {
    // an tat ca cac hinh anh
    for (var i = 0; i < slides.length; i++) {
        slides[i].style.display = "none"
    }
    // hien thi mot anh o dau
    slides[index].style.display = "block"
}

function next() {
    index += 1
    if (index > slides.length - 1) {
        index = 0
    }
    slideshow()
}

function start() {
    interval = setInterval(next, 1500)
}

function stop() {
    clearInterval(interval)
}

function first() {
    index = 0
    slideshow()
}

function last() {
    index = slides.length - 1
    slideshow()
}

document.getElementById("first").addEventListener("click", first)
document.getElementById("last").addEventListener("click", last)
document.getElementById("start").addEventListener("click", start)
document.getElementById("stop").addEventListener("click", stop)

start()