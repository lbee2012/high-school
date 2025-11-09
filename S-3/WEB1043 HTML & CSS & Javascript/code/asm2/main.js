var slides = document.getElementsByClassName("slide")
console.log(slides)

var index = 0
function slideshow(n) {

    if (n > slides.length - 1) {
        index = 0
    }

    //ẩn tất cả hình ảnh
    for (var i = 0; i < slides.length; i++) {
        slides[i].style.display = "none"
    }

    //hiển thị một 1 hình ảnh
    slides[index].style.display = "block"
}

function firstSlide() {
    index = 0
}

function nextSlide() {
    slideshow(index += 1)
    if (index > index.length - 1) {
        index = 0
    }
}

function backSlide() {
    if (index > 0) {
        index--
    } else {
        index = index.length - 1
    }
}

function lastSlide() {
    index = index.length - 1
}

function startSlide() {
    interval = setInterval(nextSlide, 1000)
}

function stopSlide() {
    clearInterval(interval)
}

document.getElementById("next").addEventListener("click", nextSlide)
document.getElementById("back").addEventListener("click", backSlide)
document.getElementById("start").addEventListener("click", startSlide)
document.getElementById("stop").addEventListener("click", stopSlide)

startSlide()
