const functions = require("firebase-functions");
const admin = require("firebase-admin");
admin.initializeApp();
const db = admin.firestore();

exports.onUserCreate = functions.firestore.document('Servicio/{id_servicio}').onCreate(async (snap, context) => {
    const values = snap.data();
    const query = db.collection("Servicio");
    const snapshot = await query.where("id_anciano","==",values.id_anciano, 'cancelado', '==', false).get();
    const count = snapshot.size;
    
    if (count >= 1) {
        await db.collection("Servicio").doc(snap.id).delete();
        console.log(`No se aceptan nuevos registros de servicios`);
        
    } else {
        console.log(`¡Servicio registrado exitosamente!`);
    }
});