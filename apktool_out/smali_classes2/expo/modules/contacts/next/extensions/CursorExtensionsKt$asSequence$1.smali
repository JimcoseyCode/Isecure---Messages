.class final Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/contacts/next/extensions/CursorExtensionsKt;->asSequence(Landroid/database/Cursor;)LO8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LO8/k;",
        "Landroid/database/Cursor;",
        "Li7/B;",
        "<anonymous>",
        "(LO8/k;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.contacts.next.extensions.CursorExtensionsKt$asSequence$1"
    f = "CursorExtensions.kt"
    l = {
        0x7
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $this_asSequence:Landroid/database/Cursor;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroid/database/Cursor;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/Cursor;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;->$this_asSequence:Landroid/database/Cursor;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILn7/f;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ln7/f;",
            ")",
            "Ln7/f;"
        }
    .end annotation

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;->$this_asSequence:Landroid/database/Cursor;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;-><init>(Landroid/database/Cursor;Ln7/f;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(LO8/k;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LO8/k;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LO8/k;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;->invoke(LO8/k;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;->label:I

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
    iget-object v1, p0, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LO8/k;

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
    iget-object p1, p0, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;->L$0:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, LO8/k;

    .line 34
    .line 35
    move-object v1, p1

    .line 36
    :cond_2
    :goto_0
    iget-object p1, p0, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;->$this_asSequence:Landroid/database/Cursor;

    .line 37
    .line 38
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    iget-object p1, p0, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;->$this_asSequence:Landroid/database/Cursor;

    .line 45
    .line 46
    iput-object v1, p0, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    iput v2, p0, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt$asSequence$1;->label:I

    .line 49
    .line 50
    invoke-virtual {v1, p1, p0}, LO8/k;->c(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v0, :cond_2

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_3
    sget-object p1, Li7/B;->a:Li7/B;

    .line 58
    .line 59
    return-object p1
.end method
