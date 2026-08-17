.class public final Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3;
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
    c = "expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3"
    f = "ContactsNextModule.kt"
    l = {
        0x110
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ln7/f;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final invoke(LR8/N;[Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;
    .locals 0
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
    new-instance p1, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3;

    invoke-direct {p1, p3}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3;-><init>(Ln7/f;)V

    iput-object p2, p1, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3;->L$0:Ljava/lang/Object;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Ln7/f;

    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3;->invoke(LR8/N;[Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3;->label:I

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
    iget-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lexpo/modules/contacts/next/records/SkipFormatter;

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
    iget-object p1, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3;->L$0:Ljava/lang/Object;

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
    check-cast p1, Ljava/util/Set;

    .line 41
    .line 42
    check-cast v1, Lexpo/modules/contacts/next/Contact;

    .line 43
    .line 44
    new-instance v3, Lexpo/modules/contacts/next/records/SkipFormatter;

    .line 45
    .line 46
    invoke-direct {v3, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;-><init>(Ljava/util/Set;)V

    .line 47
    .line 48
    .line 49
    iput-object v3, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    iput v2, p0, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3;->label:I

    .line 52
    .line 53
    invoke-virtual {v1, p1, p0}, Lexpo/modules/contacts/next/Contact;->getDetails(Ljava/util/Set;Ln7/f;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v0, :cond_2

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_2
    move-object v0, v3

    .line 61
    :goto_0
    check-cast p1, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->format(Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1
.end method
