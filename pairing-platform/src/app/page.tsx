'use client';

import React, { useState } from 'react';
import { Smartphone, Shield, ArrowRight, Copy, Check, Fingerprint } from 'lucide-react';

export default function App() {
  const [role, setRole] = useState<'A' | 'B' | 'OFFLINE' | 'INTERCEPT'>('A');
  const [loading, setLoading] = useState(false);
  const [copied, setCopied] = useState(false);
  
  // State for Device A
  const [keypairHex, setKeypairHex] = useState('');
  const [generatedOva, setGeneratedOva] = useState('');
  const [receivedOvb, setReceivedOvb] = useState('');
  const [sasA, setSasA] = useState('');

  // State for Device B
  const [receivedOva, setReceivedOva] = useState('');
  const [generatedOvb, setGeneratedOvb] = useState('');
  const [sasB, setSasB] = useState('');

  // State for Offline
  const [ssPq, setSsPq] = useState('');
  const [ssEc, setSsEc] = useState('');
  const [ctEc, setCtEc] = useState('');
  const [pkEc, setPkEc] = useState('');
  const [sasOffline, setSasOffline] = useState('');

  // State for Intercept
  const [interceptOva, setInterceptOva] = useState('');
  const [interceptOvb, setInterceptOvb] = useState('');
  const [interceptError, setInterceptError] = useState('');

  const copyToClipboard = (text: string) => {
    navigator.clipboard.writeText(text);
    setCopied(true);
    setTimeout(() => setCopied(false), 2000);
  };

  const computeIntercept = async () => {
    setLoading(true);
    setInterceptError('');
    try {
      const res = await fetch('/api/simulate', {
        method: 'PUT',
        body: JSON.stringify({ sms_a: interceptOva, sms_b: interceptOvb })
      }).then(r => r.json());
      
      if (res.error) setInterceptError(res.message);
    } catch (e) {
      console.error(e);
    } finally {
      setLoading(false);
    }
  };

  const computeOffline = async () => {
    setLoading(true);
    try {
      const res = await fetch('/api/simulate', {
        method: 'POST',
        body: JSON.stringify({ action: 'combine', ss_pq: ssPq, ss_ec: ssEc, ct_ec: ctEc, pk_ec: pkEc })
      }).then(r => r.json());
      
      if (res.sas) setSasOffline(res.sas);
      if (res.error) alert("Erreur: " + res.error);
    } catch (e) {
      console.error(e);
    } finally {
      setLoading(false);
    }
  };

  const generateOva = async () => {
    setLoading(true);
    try {
      const res = await fetch('/api/simulate', {
        method: 'POST',
        body: JSON.stringify({ action: 'start_a' })
      }).then(r => r.json());
      
      setKeypairHex(res.keypair_hex);
      setGeneratedOva(res.sms);
    } catch (e) {
      console.error(e);
    } finally {
      setLoading(false);
    }
  };

  const computeSasA = async () => {
    setLoading(true);
    try {
      const res = await fetch('/api/simulate', {
        method: 'POST',
        body: JSON.stringify({ action: 'complete_a', keypair_hex: keypairHex, b_sms: receivedOvb })
      }).then(r => r.json());
      
      if (res.sas) setSasA(res.sas);
      if (res.error) alert("Erreur: " + res.error);
    } catch (e) {
      console.error(e);
    } finally {
      setLoading(false);
    }
  };

  const respondAsB = async () => {
    setLoading(true);
    try {
      const res = await fetch('/api/simulate', {
        method: 'POST',
        body: JSON.stringify({ action: 'respond_b', a_sms: receivedOva })
      }).then(r => r.json());
      
      if (res.sms && res.sas) {
        setGeneratedOvb(res.sms);
        setSasB(res.sas);
      }
      if (res.error) alert("Erreur: " + res.error);
    } catch (e) {
      console.error(e);
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="min-h-screen bg-gray-50 text-gray-900 font-sans">
      <header className="bg-white border-b border-gray-200">
        <div className="max-w-4xl mx-auto px-4 py-6 flex items-center justify-between">
          <div className="flex items-center gap-3">
            <div className="w-12 h-12 rounded-xl bg-indigo-600 flex items-center justify-center text-white shadow-sm">
              <Shield size={24} />
            </div>
            <div>
              <h1 className="text-2xl font-semibold tracking-tight">OV Message Interop</h1>
              <p className="text-sm text-gray-500 font-medium">Émulateur d'Appairage Interactif</p>
            </div>
          </div>
        </div>
      </header>

      <main className="max-w-4xl mx-auto px-4 py-8">
        <div className="bg-white rounded-2xl shadow-sm border border-gray-200 overflow-hidden mb-8">
          <div className="flex border-b border-gray-200">
            <button 
              className={`flex-1 py-4 font-medium text-xs flex items-center justify-center gap-2 transition-colors ${role === 'A' ? 'bg-indigo-50/50 text-indigo-700 border-b-2 border-indigo-600' : 'text-gray-500 hover:bg-gray-50'}`}
              onClick={() => setRole('A')}
            >
              <Smartphone size={16} /> A (Initiateur)
            </button>
            <button 
              className={`flex-1 py-4 font-medium text-xs flex items-center justify-center gap-2 transition-colors ${role === 'B' ? 'bg-emerald-50/50 text-emerald-700 border-b-2 border-emerald-600' : 'text-gray-500 hover:bg-gray-50'}`}
              onClick={() => setRole('B')}
            >
              <Smartphone size={16} /> B (Répondeur)
            </button>
            <button 
              className={`flex-1 py-4 font-medium text-xs flex items-center justify-center gap-2 transition-colors ${role === 'OFFLINE' ? 'bg-purple-50/50 text-purple-700 border-b-2 border-purple-600' : 'text-gray-500 hover:bg-gray-50'}`}
              onClick={() => setRole('OFFLINE')}
            >
              <Fingerprint size={16} /> Hors-Ligne (Logs)
            </button>
            <button 
              className={`flex-1 py-4 font-medium text-xs flex items-center justify-center gap-2 transition-colors ${role === 'INTERCEPT' ? 'bg-red-50/50 text-red-700 border-b-2 border-red-600' : 'text-gray-500 hover:bg-gray-50'}`}
              onClick={() => setRole('INTERCEPT')}
            >
              <Shield size={16} /> Test 2 SMS
            </button>
          </div>

          <div className="p-8">
            {role === 'A' && (
              <div className="space-y-8 animate-in fade-in duration-300">
                {/* Step 1 */}
                <div className="relative pl-8 border-l-2 border-indigo-100 pb-8">
                  <div className="absolute w-6 h-6 bg-indigo-100 rounded-full -left-[13px] flex items-center justify-center top-0 border-4 border-white">
                    <span className="text-xs font-bold text-indigo-600">1</span>
                  </div>
                  <h3 className="text-lg font-semibold mb-2">Générer votre code (OVA)</h3>
                  <p className="text-sm text-gray-500 mb-4">L'appareil A génère ses paires de clés hybrides et les prépare pour l'envoi.</p>
                  
                  {!generatedOva ? (
                    <button onClick={generateOva} disabled={loading} className="bg-indigo-600 hover:bg-indigo-700 text-white px-5 py-2.5 rounded-xl font-medium transition-colors text-sm shadow-sm">
                      {loading ? 'Génération...' : 'Générer le code OVA'}
                    </button>
                  ) : (
                    <div className="bg-gray-50 border border-gray-200 rounded-xl p-4">
                      <div className="flex justify-between items-center mb-2">
                        <span className="text-xs font-bold text-gray-500 uppercase">Code OVA à envoyer à B</span>
                        <button onClick={() => copyToClipboard(generatedOva)} className="text-indigo-600 hover:text-indigo-700 flex items-center gap-1 text-xs font-medium">
                          {copied ? <Check size={14} /> : <Copy size={14} />} {copied ? 'Copié' : 'Copier'}
                        </button>
                      </div>
                      <p className="font-mono text-xs text-gray-600 break-all bg-white p-3 rounded-lg border border-gray-100 max-h-32 overflow-y-auto">
                        {generatedOva}
                      </p>
                    </div>
                  )}
                </div>

                {/* Step 2 */}
                <div className="relative pl-8 border-l-2 border-indigo-100">
                  <div className="absolute w-6 h-6 bg-indigo-100 rounded-full -left-[13px] flex items-center justify-center top-0 border-4 border-white">
                    <span className="text-xs font-bold text-indigo-600">2</span>
                  </div>
                  <h3 className="text-lg font-semibold mb-2">Recevoir la réponse (OVB)</h3>
                  <p className="text-sm text-gray-500 mb-4">Collez ici le code OVB (chiffré) que l'appareil B vous a renvoyé.</p>
                  
                  <textarea 
                    value={receivedOvb}
                    onChange={(e) => setReceivedOvb(e.target.value)}
                    placeholder="Collez le code OVB:B:... ou OVPK:... ici"
                    className="w-full h-32 p-4 text-xs font-mono bg-white border border-gray-300 rounded-xl focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 outline-none resize-none mb-4"
                  />
                  
                  <button 
                    onClick={computeSasA} 
                    disabled={!receivedOvb || loading} 
                    className="bg-gray-900 hover:bg-black text-white px-5 py-2.5 rounded-xl font-medium transition-colors text-sm shadow-sm disabled:opacity-50 flex items-center gap-2"
                  >
                    Calculer le SAS <ArrowRight size={16} />
                  </button>
                </div>

                {sasA && (
                  <div className="mt-8 bg-indigo-50 border border-indigo-100 rounded-2xl p-6 text-center animate-in slide-in-from-bottom-4">
                    <div className="w-12 h-12 bg-white rounded-full flex items-center justify-center mx-auto mb-4 text-indigo-600 shadow-sm">
                      <Fingerprint size={24} />
                    </div>
                    <h4 className="text-sm font-semibold text-gray-600 uppercase tracking-wider mb-2">Code de Sécurité (SAS)</h4>
                    <div className="text-4xl font-mono tracking-widest font-medium text-gray-900">
                      {sasA.match(/.{1,4}/g)?.join('-')}
                    </div>
                    <p className="text-xs text-gray-500 mt-4">Vérifiez verbalement que l'appareil B affiche le même code.</p>
                  </div>
                )}
              </div>
            )}

            {role === 'B' && (
              <div className="space-y-8 animate-in fade-in duration-300">
                {/* Step 1 */}
                <div className="relative pl-8 border-l-2 border-emerald-100 pb-8">
                  <div className="absolute w-6 h-6 bg-emerald-100 rounded-full -left-[13px] flex items-center justify-center top-0 border-4 border-white">
                    <span className="text-xs font-bold text-emerald-600">1</span>
                  </div>
                  <h3 className="text-lg font-semibold mb-2">Recevoir le code initiateur (OVA)</h3>
                  <p className="text-sm text-gray-500 mb-4">Collez ici le code public généré et envoyé par l'appareil A.</p>
                  
                  <textarea 
                    value={receivedOva}
                    onChange={(e) => setReceivedOva(e.target.value)}
                    placeholder="Collez le code OVB:A:... ou OVPK:I:... ici"
                    className="w-full h-32 p-4 text-xs font-mono bg-white border border-gray-300 rounded-xl focus:ring-2 focus:ring-emerald-500 focus:border-emerald-500 outline-none resize-none mb-4"
                  />
                  
                  <button 
                    onClick={respondAsB} 
                    disabled={!receivedOva || loading} 
                    className="bg-emerald-600 hover:bg-emerald-700 text-white px-5 py-2.5 rounded-xl font-medium transition-colors text-sm shadow-sm disabled:opacity-50"
                  >
                    {loading ? 'Calcul en cours...' : 'Décapsuler et générer la réponse (OVB)'}
                  </button>
                </div>

                {/* Step 2 (Results) */}
                {generatedOvb && sasB && (
                  <div className="relative pl-8 border-l-2 border-emerald-100 animate-in slide-in-from-bottom-4">
                    <div className="absolute w-6 h-6 bg-emerald-100 rounded-full -left-[13px] flex items-center justify-center top-0 border-4 border-white">
                      <span className="text-xs font-bold text-emerald-600">2</span>
                    </div>
                    <h3 className="text-lg font-semibold mb-2">Transmettre OVB et Vérifier</h3>
                    
                    <div className="bg-gray-50 border border-gray-200 rounded-xl p-4 mb-6">
                      <div className="flex justify-between items-center mb-2">
                        <span className="text-xs font-bold text-gray-500 uppercase">Code OVB à renvoyer à A</span>
                        <button onClick={() => copyToClipboard(generatedOvb)} className="text-emerald-600 hover:text-emerald-700 flex items-center gap-1 text-xs font-medium">
                          {copied ? <Check size={14} /> : <Copy size={14} />} {copied ? 'Copié' : 'Copier'}
                        </button>
                      </div>
                      <p className="font-mono text-xs text-gray-600 break-all bg-white p-3 rounded-lg border border-gray-100 max-h-32 overflow-y-auto">
                        {generatedOvb}
                      </p>
                    </div>

                    <div className="bg-emerald-50 border border-emerald-100 rounded-2xl p-6 text-center">
                      <div className="w-12 h-12 bg-white rounded-full flex items-center justify-center mx-auto mb-4 text-emerald-600 shadow-sm">
                        <Fingerprint size={24} />
                      </div>
                      <h4 className="text-sm font-semibold text-gray-600 uppercase tracking-wider mb-2">Code de Sécurité (SAS)</h4>
                      <div className="text-4xl font-mono tracking-widest font-medium text-gray-900">
                        {sasB.match(/.{1,4}/g)?.join('-')}
                      </div>
                      <p className="text-xs text-gray-500 mt-4">Vérifiez verbalement que l'appareil A affiche le même code.</p>
                    </div>
                  </div>
                )}
              </div>
            )}
            {role === 'OFFLINE' && (
              <div className="space-y-8 animate-in fade-in duration-300">
                <div className="relative pl-8 border-l-2 border-purple-100 pb-2">
                  <div className="absolute w-6 h-6 bg-purple-100 rounded-full -left-[13px] flex items-center justify-center top-0 border-4 border-white">
                    <span className="text-xs font-bold text-purple-600">i</span>
                  </div>
                  <h3 className="text-lg font-semibold mb-2">Calcul direct depuis les logs d'interception (OVCAL)</h3>
                  <p className="text-sm text-gray-500 mb-6">
                    Cette méthode permet de calculer le code SAS si vous avez extrait les variables cryptographiques internes des téléphones via un logcat (ssPq, ssEc, etc.). 
                    Il est impossible de calculer le SAS juste à partir des SMS publics sans ces clés privées.
                  </p>
                  
                  <div className="grid grid-cols-1 md:grid-cols-2 gap-4 mb-6">
                    <div>
                      <label className="text-xs font-bold text-gray-400 uppercase tracking-wider block mb-1">ssPq (Secret ML-KEM)</label>
                      <input 
                        type="text" 
                        value={ssPq}
                        onChange={e => setSsPq(e.target.value)}
                        placeholder="Ex: 5b3a..."
                        className="w-full p-3 text-xs font-mono bg-white border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-500 focus:border-purple-500 outline-none"
                      />
                    </div>
                    <div>
                      <label className="text-xs font-bold text-gray-400 uppercase tracking-wider block mb-1">ssEc (Secret X25519)</label>
                      <input 
                        type="text" 
                        value={ssEc}
                        onChange={e => setSsEc(e.target.value)}
                        placeholder="Ex: 8f1c..."
                        className="w-full p-3 text-xs font-mono bg-white border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-500 focus:border-purple-500 outline-none"
                      />
                    </div>
                    <div>
                      <label className="text-xs font-bold text-gray-400 uppercase tracking-wider block mb-1">ctEc (Clé Ephémère X25519)</label>
                      <input 
                        type="text" 
                        value={ctEc}
                        onChange={e => setCtEc(e.target.value)}
                        placeholder="Ex: d4a2..."
                        className="w-full p-3 text-xs font-mono bg-white border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-500 focus:border-purple-500 outline-none"
                      />
                    </div>
                    <div>
                      <label className="text-xs font-bold text-gray-400 uppercase tracking-wider block mb-1">pkEc (Clé Publique X25519)</label>
                      <input 
                        type="text" 
                        value={pkEc}
                        onChange={e => setPkEc(e.target.value)}
                        placeholder="Ex: 11e7..."
                        className="w-full p-3 text-xs font-mono bg-white border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-500 focus:border-purple-500 outline-none"
                      />
                    </div>
                  </div>
                  
                  <button 
                    onClick={computeOffline} 
                    disabled={!ssPq || !ssEc || !ctEc || !pkEc || loading} 
                    className="bg-purple-600 hover:bg-purple-700 text-white px-5 py-2.5 rounded-xl font-medium transition-colors text-sm shadow-sm disabled:opacity-50"
                  >
                    {loading ? 'Calcul en cours...' : 'Calculer le SAS à partir des logs'}
                  </button>
                </div>

                {sasOffline && (
                  <div className="bg-purple-50 border border-purple-100 rounded-2xl p-6 text-center animate-in slide-in-from-bottom-4">
                    <div className="w-12 h-12 bg-white rounded-full flex items-center justify-center mx-auto mb-4 text-purple-600 shadow-sm">
                      <Fingerprint size={24} />
                    </div>
                    <h4 className="text-sm font-semibold text-gray-600 uppercase tracking-wider mb-2">Code de Sécurité (SAS) Trouvé</h4>
                    <div className="text-4xl font-mono tracking-widest font-medium text-gray-900">
                      {sasOffline.match(/.{1,4}/g)?.join('-')}
                    </div>
                  </div>
                )}
              </div>
            )}
            {role === 'INTERCEPT' && (
              <div className="space-y-8 animate-in fade-in duration-300">
                <div className="relative pl-8 border-l-2 border-red-100 pb-2">
                  <div className="absolute w-6 h-6 bg-red-100 rounded-full -left-[13px] flex items-center justify-center top-0 border-4 border-white">
                    <span className="text-xs font-bold text-red-600">!</span>
                  </div>
                  <h3 className="text-lg font-semibold mb-2">Test d'Interception (Vérification Cryptographique)</h3>
                  <p className="text-sm text-gray-500 mb-6">
                    Collez ici deux codes publics (OVPK) interceptés depuis deux téléphones réels. La plateforme tentera de calculer le code SAS final.
                  </p>
                  
                  <div className="grid grid-cols-1 md:grid-cols-2 gap-4 mb-6">
                    <div>
                      <label className="text-xs font-bold text-gray-400 uppercase tracking-wider block mb-1">Code Tel 1 (Initiateur)</label>
                      <textarea 
                        value={interceptOva}
                        onChange={e => setInterceptOva(e.target.value)}
                        placeholder="Ex: OVPK:FKTF:I:..."
                        className="w-full h-32 p-3 text-xs font-mono bg-white border border-gray-300 rounded-lg focus:ring-2 focus:ring-red-500 focus:border-red-500 outline-none resize-none"
                      />
                    </div>
                    <div>
                      <label className="text-xs font-bold text-gray-400 uppercase tracking-wider block mb-1">Code Tel 2 (Répondeur)</label>
                      <textarea 
                        value={interceptOvb}
                        onChange={e => setInterceptOvb(e.target.value)}
                        placeholder="Ex: OVPK:FKTF:R:..."
                        className="w-full h-32 p-3 text-xs font-mono bg-white border border-gray-300 rounded-lg focus:ring-2 focus:ring-red-500 focus:border-red-500 outline-none resize-none"
                      />
                    </div>
                  </div>
                  
                  <button 
                    onClick={computeIntercept} 
                    disabled={!interceptOva || !interceptOvb || loading} 
                    className="bg-red-600 hover:bg-red-700 text-white px-5 py-2.5 rounded-xl font-medium transition-colors text-sm shadow-sm disabled:opacity-50"
                  >
                    {loading ? 'Calcul en cours...' : 'Tenter de calculer le SAS'}
                  </button>
                </div>

                {interceptError && (
                  <div className="bg-red-50 border border-red-100 rounded-2xl p-6 text-center animate-in slide-in-from-bottom-4">
                    <div className="w-12 h-12 bg-white rounded-full flex items-center justify-center mx-auto mb-4 text-red-600 shadow-sm">
                      <Shield size={24} />
                    </div>
                    <h4 className="text-sm font-semibold text-red-800 uppercase tracking-wider mb-2">Échec Cryptographique</h4>
                    <p className="text-sm text-red-600 font-medium">{interceptError}</p>
                  </div>
                )}
              </div>
            )}
          </div>
        </div>
      </main>
    </div>
  );
}
