.class public final Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;
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
        "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$5"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179"
    f = "ContactsNextModule.kt"
    l = {
        0x10f
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
    iput-object p2, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;->this$0:Lexpo/modules/contacts/next/ContactsNextModule;

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
    new-instance p1, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;

    iget-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;->this$0:Lexpo/modules/contacts/next/ContactsNextModule;

    invoke-direct {p1, p3, v0}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;-><init>(Ln7/f;Lexpo/modules/contacts/next/ContactsNextModule;)V

    iput-object p2, p1, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;->L$0:Ljava/lang/Object;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Ln7/f;

    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;->invoke(LR8/N;[Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

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
    iget v1, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;->label:I

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
    iget-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/Set;

    .line 15
    .line 16
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;->L$0:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, [Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    aget-object v1, p1, v1

    .line 37
    .line 38
    aget-object p1, p1, v2

    .line 39
    .line 40
    move-object v7, p1

    .line 41
    check-cast v7, Lexpo/modules/contacts/next/records/ContactQueryOptions;

    .line 42
    .line 43
    move-object v6, v1

    .line 44
    check-cast v6, Ljava/util/Set;

    .line 45
    .line 46
    sget-object v3, Lexpo/modules/contacts/next/Contact;->Companion:Lexpo/modules/contacts/next/Contact$Companion;

    .line 47
    .line 48
    iget-object p1, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;->this$0:Lexpo/modules/contacts/next/ContactsNextModule;

    .line 49
    .line 50
    invoke-static {p1}, Lexpo/modules/contacts/next/ContactsNextModule;->access$getContactRepository(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget-object p1, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;->this$0:Lexpo/modules/contacts/next/ContactsNextModule;

    .line 55
    .line 56
    invoke-static {p1}, Lexpo/modules/contacts/next/ContactsNextModule;->access$getContactMapper(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    iput-object v6, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;->L$0:Ljava/lang/Object;

    .line 61
    .line 62
    iput v2, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;->label:I

    .line 63
    .line 64
    move-object v8, p0

    .line 65
    invoke-virtual/range {v3 .. v8}, Lexpo/modules/contacts/next/Contact$Companion;->getAllWithDetails(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Ljava/util/Set;Lexpo/modules/contacts/next/records/ContactQueryOptions;Ln7/f;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v0, :cond_2

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_2
    move-object v0, v6

    .line 73
    :goto_0
    check-cast p1, Ljava/lang/Iterable;

    .line 74
    .line 75
    new-instance v1, Ljava/util/ArrayList;

    .line 76
    .line 77
    const/16 v2, 0xa

    .line 78
    .line 79
    invoke-static {p1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    check-cast v2, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;

    .line 101
    .line 102
    new-instance v3, Lexpo/modules/contacts/next/records/SkipFormatter;

    .line 103
    .line 104
    invoke-direct {v3, v0}, Lexpo/modules/contacts/next/records/SkipFormatter;-><init>(Ljava/util/Set;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v2}, Lexpo/modules/contacts/next/records/SkipFormatter;->format(Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    return-object v1
.end method
