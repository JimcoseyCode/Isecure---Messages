.class public final Lexpo/modules/securestore/SecureStoreModule$definition$lambda$7$$inlined$OnCreate$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/securestore/SecureStoreModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw7/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lexpo/modules/securestore/SecureStoreModule;


# direct methods
.method public constructor <init>(Lexpo/modules/securestore/SecureStoreModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/securestore/SecureStoreModule$definition$lambda$7$$inlined$OnCreate$1;->this$0:Lexpo/modules/securestore/SecureStoreModule;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/securestore/SecureStoreModule$definition$lambda$7$$inlined$OnCreate$1;->invoke()V

    sget-object v0, Li7/B;->a:Li7/B;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lexpo/modules/securestore/SecureStoreModule$definition$lambda$7$$inlined$OnCreate$1;->this$0:Lexpo/modules/securestore/SecureStoreModule;

    new-instance v1, Lexpo/modules/securestore/AuthenticationHelper;

    iget-object v2, p0, Lexpo/modules/securestore/SecureStoreModule$definition$lambda$7$$inlined$OnCreate$1;->this$0:Lexpo/modules/securestore/SecureStoreModule;

    invoke-virtual {v2}, Lexpo/modules/securestore/SecureStoreModule;->getReactContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lexpo/modules/securestore/SecureStoreModule$definition$lambda$7$$inlined$OnCreate$1;->this$0:Lexpo/modules/securestore/SecureStoreModule;

    invoke-virtual {v3}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v3

    invoke-virtual {v3}, Lexpo/modules/kotlin/AppContext;->getLegacyModuleRegistry()Lexpo/modules/core/ModuleRegistry;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lexpo/modules/securestore/AuthenticationHelper;-><init>(Landroid/content/Context;Lexpo/modules/core/ModuleRegistry;)V

    invoke-static {v0, v1}, Lexpo/modules/securestore/SecureStoreModule;->access$setAuthenticationHelper$p(Lexpo/modules/securestore/SecureStoreModule;Lexpo/modules/securestore/AuthenticationHelper;)V

    .line 3
    iget-object v0, p0, Lexpo/modules/securestore/SecureStoreModule$definition$lambda$7$$inlined$OnCreate$1;->this$0:Lexpo/modules/securestore/SecureStoreModule;

    new-instance v1, Lexpo/modules/securestore/encryptors/HybridAESEncryptor;

    iget-object v2, p0, Lexpo/modules/securestore/SecureStoreModule$definition$lambda$7$$inlined$OnCreate$1;->this$0:Lexpo/modules/securestore/SecureStoreModule;

    invoke-virtual {v2}, Lexpo/modules/securestore/SecureStoreModule;->getReactContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lexpo/modules/securestore/SecureStoreModule$definition$lambda$7$$inlined$OnCreate$1;->this$0:Lexpo/modules/securestore/SecureStoreModule;

    invoke-static {v3}, Lexpo/modules/securestore/SecureStoreModule;->access$getMAESEncryptor$p(Lexpo/modules/securestore/SecureStoreModule;)Lexpo/modules/securestore/encryptors/AESEncryptor;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lexpo/modules/securestore/encryptors/HybridAESEncryptor;-><init>(Landroid/content/Context;Lexpo/modules/securestore/encryptors/AESEncryptor;)V

    invoke-static {v0, v1}, Lexpo/modules/securestore/SecureStoreModule;->access$setHybridAESEncryptor$p(Lexpo/modules/securestore/SecureStoreModule;Lexpo/modules/securestore/encryptors/HybridAESEncryptor;)V

    .line 4
    const-string v0, "AndroidKeyStore"

    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v0

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    .line 6
    iget-object v1, p0, Lexpo/modules/securestore/SecureStoreModule$definition$lambda$7$$inlined$OnCreate$1;->this$0:Lexpo/modules/securestore/SecureStoreModule;

    invoke-static {v1, v0}, Lexpo/modules/securestore/SecureStoreModule;->access$setKeyStore$p(Lexpo/modules/securestore/SecureStoreModule;Ljava/security/KeyStore;)V

    return-void
.end method
