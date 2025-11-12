<template>
    <section class="container">
        <h1>Quan ly Mon an</h1>
        <MonAnComponent v-model:ma="ma"/>
        <button type="button" class="btn btn-primary" @click="addMA()">Add</button>
        <button type="button" class="btn btn-success" @click="addMA()">Update</button>
        <table class="table containter">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Ten</th>
                    <th scope="col">Loai</th>
                    <th scope="col">Gia</th>
                    <th scope="col">Mo ta</th>
                    <th scope="col">Hanh dong</th>
                </tr>
            </thead>
            <tbody>
                <template v-for="(item, index) in listMA" :key="item.id">
                    <tr>
                        <td>{{ index++ }}</td>
                        <td>{{ item.ten }}</td>
                        <td>{{ item.loai }}</td>
                        <td>{{ item.gia }}</td>
                        <td>{{ item.moTa }}</td>
                        <td>
                            <button type="button" class="btn btn-danger" @click="deleteMA(index)">Delete</button>
                            <button type="button" class="btn btn-warning" @click="detailMA(item)">Detail</button>
                        </td>
                    </tr>
                </template>
            </tbody>
        </table>
    </section>
</template>

<script setup>
import MonAnComponent from '@/components/MonAnComponent.vue';
import { ref } from 'vue';

const listMA = ref([
    { ten: 'ma1', loai: 'l1', gia: 1, moTa: 'mt1'},
    { ten: 'ma2', loai: 'l2', gia: 2, moTa: 'mt2'},
    { ten: 'ma3', loai: 'l3', gia: 3, moTa: 'mt3'},
    { ten: 'ma4', loai: 'l4', gia: 4, moTa: 'mt4'},
    { ten: 'ma5', loai: 'l5', gia: 5, moTa: 'mt5'},
]);

const idUpdate = ref(-1);
const ma = ref({
    ten: '',
    loai: '',
    gia: 0,
    moTa: '',
});

function deleteMA(index) {
    listMA.value.splice(index, 1);
};
function detailMA(item) {
    ma.value = { ...item };
    idUpdate.value = item.id;
};

function resetMA() {
    ma.value = {
        ten: '',
        loai: '',
        gia: 0,
        moTa: '',
    };
};

function addMA() {
    listMA.value.push({
        id: listMA.value.length + 1,
        ...ma.value,
    });
    resetMA();
};
function updateMA() {
    listMA.value[idUpdate.value] = { ...ma.value };
    resetMA();
    idUpdate.value = -1
}
</script>

<style scoped>
h1 {
    text-align: center;
}
</style>