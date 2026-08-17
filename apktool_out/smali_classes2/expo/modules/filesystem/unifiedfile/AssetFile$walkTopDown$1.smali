.class final Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/filesystem/unifiedfile/AssetFile;->walkTopDown()LO8/i;
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
        "Lexpo/modules/filesystem/unifiedfile/AssetFile;",
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
    c = "expo.modules.filesystem.unifiedfile.AssetFile$walkTopDown$1"
    f = "AssetFile.kt"
    l = {
        0x85,
        0x8b
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

.field final synthetic this$0:Lexpo/modules/filesystem/unifiedfile/AssetFile;


# direct methods
.method constructor <init>(Lexpo/modules/filesystem/unifiedfile/AssetFile;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/filesystem/unifiedfile/AssetFile;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/AssetFile;

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
    new-instance v0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/AssetFile;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;-><init>(Lexpo/modules/filesystem/unifiedfile/AssetFile;Ln7/f;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LO8/k;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->invoke(LO8/k;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->label:I

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
    iget v1, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->I$1:I

    .line 16
    .line 17
    iget v4, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->I$0:I

    .line 18
    .line 19
    iget-object v5, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->L$2:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v5, Lexpo/modules/filesystem/unifiedfile/AssetFile;

    .line 22
    .line 23
    iget-object v6, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->L$1:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v6, [Ljava/lang/String;

    .line 26
    .line 27
    iget-object v7, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v7, LO8/k;

    .line 30
    .line 31
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_4

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
    iget-object v1, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->L$0:Ljava/lang/Object;

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
    iget-object p1, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v1, p1

    .line 58
    check-cast v1, LO8/k;

    .line 59
    .line 60
    iget-object p1, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/AssetFile;

    .line 61
    .line 62
    iput-object v1, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    iput v3, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->label:I

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
    goto/16 :goto_3

    .line 73
    .line 74
    :cond_3
    :goto_0
    iget-object p1, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/AssetFile;

    .line 75
    .line 76
    invoke-virtual {p1}, Lexpo/modules/filesystem/unifiedfile/AssetFile;->isDirectory()Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_6

    .line 81
    .line 82
    iget-object p1, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/AssetFile;

    .line 83
    .line 84
    invoke-static {p1}, Lexpo/modules/filesystem/unifiedfile/AssetFile;->access$getContext$p(Lexpo/modules/filesystem/unifiedfile/AssetFile;)Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object v4, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/AssetFile;

    .line 93
    .line 94
    invoke-virtual {v4}, Lexpo/modules/filesystem/unifiedfile/AssetFile;->getPath()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {p1, v4}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-eqz p1, :cond_6

    .line 103
    .line 104
    iget-object v4, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/AssetFile;

    .line 105
    .line 106
    array-length v5, p1

    .line 107
    const/4 v6, 0x0

    .line 108
    move-object v7, v1

    .line 109
    move v1, v5

    .line 110
    move-object v5, v4

    .line 111
    move v4, v6

    .line 112
    move-object v6, p1

    .line 113
    :goto_1
    if-ge v4, v1, :cond_6

    .line 114
    .line 115
    aget-object p1, v6, v4

    .line 116
    .line 117
    invoke-virtual {v5}, Lexpo/modules/filesystem/unifiedfile/AssetFile;->getPath()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-nez v8, :cond_4

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    invoke-virtual {v5}, Lexpo/modules/filesystem/unifiedfile/AssetFile;->getPath()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    new-instance v9, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v8, "/"

    .line 141
    .line 142
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    :goto_2
    new-instance v8, Lexpo/modules/filesystem/unifiedfile/AssetFile;

    .line 153
    .line 154
    invoke-static {v5}, Lexpo/modules/filesystem/unifiedfile/AssetFile;->access$getContext$p(Lexpo/modules/filesystem/unifiedfile/AssetFile;)Landroid/content/Context;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    new-instance v10, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    const-string v11, "asset:///"

    .line 164
    .line 165
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-direct {v8, v9, p1}, Lexpo/modules/filesystem/unifiedfile/AssetFile;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v8}, Lexpo/modules/filesystem/unifiedfile/AssetFile;->walkTopDown()LO8/i;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    iput-object v7, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->L$0:Ljava/lang/Object;

    .line 187
    .line 188
    iput-object v6, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->L$1:Ljava/lang/Object;

    .line 189
    .line 190
    iput-object v5, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->L$2:Ljava/lang/Object;

    .line 191
    .line 192
    iput v4, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->I$0:I

    .line 193
    .line 194
    iput v1, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->I$1:I

    .line 195
    .line 196
    iput v2, p0, Lexpo/modules/filesystem/unifiedfile/AssetFile$walkTopDown$1;->label:I

    .line 197
    .line 198
    invoke-virtual {v7, p1, p0}, LO8/k;->e(LO8/i;Ln7/f;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    if-ne p1, v0, :cond_5

    .line 203
    .line 204
    :goto_3
    return-object v0

    .line 205
    :cond_5
    :goto_4
    add-int/2addr v4, v3

    .line 206
    goto :goto_1

    .line 207
    :cond_6
    sget-object p1, Li7/B;->a:Li7/B;

    .line 208
    .line 209
    return-object p1
.end method
