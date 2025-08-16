<template>
    <main class="container">
        <h3>Quan ly Phong</h3>
        <PhongComponent v-model:phong="phong"/>
        <button type="button" class="btn btn-primary" @click="addPhong()">Add</button>
        <!-- <h3>Tim kiem phong qua Dien tich</h3>
        <button type="button" class="btn btn-success" @click="searchDienTich(search.min, search.max)">Search</button> -->
        <table class="table container">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Ten</th>
                    <th scope="col">Tang</th>
                    <th scope="col">Loai</th>
                    <th scope="col">Dien tich</th>
                    <th scope="col">Hanh dong</th>
                </tr>
            </thead>
            <tbody>
                <template v-for="(item, index) in listPhong" :key="item.id">
                    <tr>
                        <td>{{ index + 1 }}</td>
                        <td>{{ item.ten }}</td>
                        <td>{{ item.tang }}</td>
                        <td>{{ item.loai == true ? "Phong VIP" : "Phong thuong" }}</td>
                        <td>{{ item.dienTich }}</td>
                        <td>
                            <button type="button" class="btn btn-danger" @click="deletePhong(index)">Delete</button>
                        </td>
                    </tr>
                </template>
            </tbody>
        </table>
    </main>
</template>

<script setup>
import PhongComponent from '@/components/PhongComponent.vue';
import { ref } from 'vue';
const listPhong = ref([
    { ten: 'p1', tang: 1, loai: true, dienTich: 100 },
    { ten: 'p2', tang: 2, loai: false, dienTich: 200 },
    { ten: 'p3', tang: 3, loai: true, dienTich: 300 },
    { ten: 'p4', tang: 4, loai: false, dienTich: 400 },
    { ten: 'p5', tang: 5, loai: true, dienTich: 500 },
]);

const phong = ref({
    ten: '',
    tang: 0,
    loai: false,
    dienTich: 0,
})

function deletePhong(index) {
    listPhong.value.splice(index, 1);
};

function resetPhong() {
    phong.value = {
        ten: '',
        tang: 0,
        loai: false,
        dienTich: 0,
    };
};

function addPhong() {
    if (phong.value.ten && phong.value.tang && phong.value.dienTich) {
        listPhong.value.push({
            id: listPhong.value.length + 1,
            ...phong.value,
        });
    } else {
        alert("Vui long nhap day du thong tin");
    };
    resetPhong();
};

function searchDienTich(min, max) {
    
}
</script>

<style scoped>
h3 {
    text-align: center;
}
</style>