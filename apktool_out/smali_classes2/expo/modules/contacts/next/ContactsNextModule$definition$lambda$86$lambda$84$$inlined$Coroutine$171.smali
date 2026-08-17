.class public final Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/contacts/next/ContactsNextModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lw7/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "LR8/N;",
        "",
        "",
        "<destruct>",
        "<anonymous>",
        "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;",
        "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$3"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171"
    f = "ContactsNextModule.kt"
    l = {
        0x110
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/contacts/next/ContactsNextModule;


# direct methods
.method public constructor <init>(Ln7/f;Lexpo/modules/contacts/next/ContactsNextModule;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;->this$0:Lexpo/modules/contacts/next/ContactsNextModule;

    .line 2
    .line 3
    const/4 p2, 0x3

    .line 4
    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(LR8/N;[Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR8/N;",
            "[",
            "Ljava/lang/Object;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;

    iget-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;->this$0:Lexpo/modules/contacts/next/ContactsNextModule;

    invoke-direct {p1, p3, v0}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;-><init>(Ln7/f;Lexpo/modules/contacts/next/ContactsNextModule;)V

    iput-object p2, p1, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;->L$0:Ljava/lang/Object;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Ln7/f;

    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;->invoke(LR8/N;[Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, [Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    aget-object p1, p1, v1

    .line 33
    .line 34
    move-object v4, p1

    .line 35
    check-cast v4, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;

    .line 36
    .line 37
    iget-object p1, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;->this$0:Lexpo/modules/contacts/next/ContactsNextModule;

    .line 38
    .line 39
    invoke-static {p1}, Lexpo/modules/contacts/next/ContactsNextModule;->access$getPermissionsDelegate(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/ContactsPermissionsDelegate;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lexpo/modules/contacts/next/ContactsPermissionsDelegate;->ensurePermissions()V

    .line 44
    .line 45
    .line 46
    sget-object v3, Lexpo/modules/contacts/next/Contact;->Companion:Lexpo/modules/contacts/next/Contact$Companion;

    .line 47
    .line 48
    iget-object p1, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;->this$0:Lexpo/modules/contacts/next/ContactsNextModule;

    .line 49
    .line 50
    invoke-static {p1}, Lexpo/modules/contacts/next/ContactsNextModule;->access$getContactRepository(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    iget-object p1, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;->this$0:Lexpo/modules/contacts/next/ContactsNextModule;

    .line 55
    .line 56
    invoke-static {p1}, Lexpo/modules/contacts/next/ContactsNextModule;->access$getContactMapper(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    iget-object p1, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;->this$0:Lexpo/modules/contacts/next/ContactsNextModule;

    .line 61
    .line 62
    invoke-static {p1}, Lexpo/modules/contacts/next/ContactsNextModule;->access$getContactFactory(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/ContactFactory;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    iput v2, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;->label:I

    .line 67
    .line 68
    move-object v8, p0

    .line 69
    invoke-virtual/range {v3 .. v8}, Lexpo/modules/contacts/next/Contact$Companion;->create(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lexpo/modules/contacts/next/ContactFactory;Ln7/f;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v0, :cond_2

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_2
    return-object p1
.end method
