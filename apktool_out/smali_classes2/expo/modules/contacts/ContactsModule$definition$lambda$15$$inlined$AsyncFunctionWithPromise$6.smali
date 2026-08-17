.class public final Lexpo/modules/contacts/ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$6;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/contacts/ContactsModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2;"
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
.field final synthetic this$0:Lexpo/modules/contacts/ContactsModule;


# direct methods
.method public constructor <init>(Lexpo/modules/contacts/ContactsModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/contacts/ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$6;->this$0:Lexpo/modules/contacts/ContactsModule;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 10
    check-cast p1, [Ljava/lang/Object;

    check-cast p2, Lexpo/modules/kotlin/Promise;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$6;->invoke([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V

    sget-object p1, Li7/B;->a:Li7/B;

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object v1, p1, v1

    const/4 v2, 0x2

    aget-object p1, p1, v2

    .line 1
    check-cast p1, Ljava/util/Map;

    check-cast v1, Ljava/util/Map;

    check-cast v0, Ljava/lang/String;

    .line 2
    iget-object p1, p0, Lexpo/modules/contacts/ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$6;->this$0:Lexpo/modules/contacts/ContactsModule;

    invoke-static {p1}, Lexpo/modules/contacts/ContactsModule;->access$ensureReadPermission(Lexpo/modules/contacts/ContactsModule;)V

    .line 3
    iget-object p1, p0, Lexpo/modules/contacts/ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$6;->this$0:Lexpo/modules/contacts/ContactsModule;

    invoke-static {p1}, Lexpo/modules/contacts/ContactsModule;->access$getContactManipulationPromise$p(Lexpo/modules/contacts/ContactsModule;)Lexpo/modules/kotlin/Promise;

    move-result-object p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_1

    .line 4
    iget-object p1, p0, Lexpo/modules/contacts/ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$6;->this$0:Lexpo/modules/contacts/ContactsModule;

    invoke-static {}, Lexpo/modules/contacts/ContactsModuleKt;->access$getDefaultFields$p()Ljava/util/Set;

    move-result-object v2

    invoke-static {p1, v0, v2}, Lexpo/modules/contacts/ContactsModule;->access$getContactById(Lexpo/modules/contacts/ContactsModule;Ljava/lang/String;Ljava/util/Set;)Lexpo/modules/contacts/Contact;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    iget-object v0, p0, Lexpo/modules/contacts/ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$6;->this$0:Lexpo/modules/contacts/ContactsModule;

    invoke-static {v0, p1, p2}, Lexpo/modules/contacts/ContactsModule;->access$presentEditForm(Lexpo/modules/contacts/ContactsModule;Lexpo/modules/contacts/Contact;Lexpo/modules/kotlin/Promise;)V

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Lexpo/modules/contacts/ContactNotFoundException;

    invoke-direct {p1}, Lexpo/modules/contacts/ContactNotFoundException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 7
    iget-object p1, p0, Lexpo/modules/contacts/ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$6;->this$0:Lexpo/modules/contacts/ContactsModule;

    const/4 v0, 0x0

    invoke-static {p1, v0, v1}, Lexpo/modules/contacts/ContactsModule;->access$mutateContact(Lexpo/modules/contacts/ContactsModule;Lexpo/modules/contacts/Contact;Ljava/util/Map;)Lexpo/modules/contacts/Contact;

    move-result-object p1

    .line 8
    iget-object v0, p0, Lexpo/modules/contacts/ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$6;->this$0:Lexpo/modules/contacts/ContactsModule;

    invoke-static {v0, p1, p2}, Lexpo/modules/contacts/ContactsModule;->access$presentForm(Lexpo/modules/contacts/ContactsModule;Lexpo/modules/contacts/Contact;Lexpo/modules/kotlin/Promise;)V

    :cond_2
    return-void

    .line 9
    :cond_3
    new-instance p1, Lexpo/modules/contacts/ContactManipulationInProgressException;

    invoke-direct {p1}, Lexpo/modules/contacts/ContactManipulationInProgressException;-><init>()V

    throw p1
.end method
