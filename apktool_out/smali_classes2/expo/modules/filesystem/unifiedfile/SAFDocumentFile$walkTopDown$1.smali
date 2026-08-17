.class final Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->walkTopDown()LO8/i;
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
        "Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;",
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
    c = "expo.modules.filesystem.unifiedfile.SAFDocumentFile$walkTopDown$1"
    f = "SAFDocumentFile.kt"
    l = {
        0x5a,
        0x5d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;


# direct methods
.method constructor <init>(Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

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
    new-instance v0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;-><init>(Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;Ln7/f;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LO8/k;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->invoke(LO8/k;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget v1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->I$1:I

    .line 16
    .line 17
    iget v4, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->I$0:I

    .line 18
    .line 19
    iget-object v5, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$2:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v5, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    .line 22
    .line 23
    iget-object v6, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$1:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v6, [LS0/a;

    .line 26
    .line 27
    iget-object v7, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v7, LO8/k;

    .line 30
    .line 31
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    iget-object v1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, LO8/k;

    .line 47
    .line 48
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v1, p1

    .line 58
    check-cast v1, LO8/k;

    .line 59
    .line 60
    iget-object p1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    .line 61
    .line 62
    iput-object v1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    iput v3, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->label:I

    .line 65
    .line 66
    invoke-virtual {v1, p1, p0}, LO8/k;->c(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v0, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :goto_0
    iget-object p1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    .line 74
    .line 75
    invoke-virtual {p1}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->isDirectory()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_5

    .line 80
    .line 81
    iget-object p1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    .line 82
    .line 83
    invoke-static {p1}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->access$getDocumentFile(Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;)LS0/a;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-eqz p1, :cond_5

    .line 88
    .line 89
    invoke-virtual {p1}, LS0/a;->q()[LS0/a;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eqz p1, :cond_5

    .line 94
    .line 95
    iget-object v4, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    .line 96
    .line 97
    array-length v5, p1

    .line 98
    const/4 v6, 0x0

    .line 99
    move-object v7, v1

    .line 100
    move v1, v5

    .line 101
    move-object v5, v4

    .line 102
    move v4, v6

    .line 103
    move-object v6, p1

    .line 104
    :goto_1
    if-ge v4, v1, :cond_5

    .line 105
    .line 106
    aget-object p1, v6, v4

    .line 107
    .line 108
    new-instance v8, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    .line 109
    .line 110
    invoke-static {v5}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->access$getContext$p(Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;)Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    invoke-virtual {p1}, LS0/a;->l()Landroid/net/Uri;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    const-string v10, "getUri(...)"

    .line 119
    .line 120
    invoke-static {p1, v10}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-direct {v8, v9, p1}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v8}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->walkTopDown()LO8/i;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iput-object v7, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$0:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v6, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$1:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v5, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$2:Ljava/lang/Object;

    .line 135
    .line 136
    iput v4, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->I$0:I

    .line 137
    .line 138
    iput v1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->I$1:I

    .line 139
    .line 140
    iput v2, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->label:I

    .line 141
    .line 142
    invoke-virtual {v7, p1, p0}, LO8/k;->e(LO8/i;Ln7/f;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-ne p1, v0, :cond_4

    .line 147
    .line 148
    :goto_2
    return-object v0

    .line 149
    :cond_4
    :goto_3
    add-int/2addr v4, v3

    .line 150
    goto :goto_1

    .line 151
    :cond_5
    sget-object p1, Li7/B;->a:Li7/B;

    .line 152
    .line 153
    return-object p1
.end method
