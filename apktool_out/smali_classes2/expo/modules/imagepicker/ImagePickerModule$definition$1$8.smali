.class final Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/imagepicker/ImagePickerModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;",
        "Li7/B;",
        "<anonymous>",
        "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.imagepicker.ImagePickerModule$definition$1$8"
    f = "ImagePickerModule.kt"
    l = {
        0x65,
        0x69,
        0x6d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/imagepicker/ImagePickerModule;


# direct methods
.method constructor <init>(Lexpo/modules/imagepicker/ImagePickerModule;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/imagepicker/ImagePickerModule;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->this$0:Lexpo/modules/imagepicker/ImagePickerModule;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

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
    new-instance v0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->this$0:Lexpo/modules/imagepicker/ImagePickerModule;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;-><init>(Lexpo/modules/imagepicker/ImagePickerModule;Ln7/f;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->invoke(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Ln7/f;)Ljava/lang/Object;

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
    iget v1, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->label:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->L$0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lexpo/modules/imagepicker/ImagePickerModule;

    .line 21
    .line 22
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    iget-object v1, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->L$1:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lexpo/modules/imagepicker/ImagePickerModule;

    .line 38
    .line 39
    iget-object v3, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;

    .line 42
    .line 43
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    iget-object v1, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->L$1:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Lexpo/modules/imagepicker/ImagePickerModule;

    .line 50
    .line 51
    iget-object v4, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v4, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;

    .line 54
    .line 55
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;

    .line 65
    .line 66
    iget-object v1, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->this$0:Lexpo/modules/imagepicker/ImagePickerModule;

    .line 67
    .line 68
    new-instance v5, Lexpo/modules/imagepicker/contracts/CameraContract;

    .line 69
    .line 70
    invoke-direct {v5, v1}, Lexpo/modules/imagepicker/contracts/CameraContract;-><init>(Lexpo/modules/kotlin/providers/AppContextProvider;)V

    .line 71
    .line 72
    .line 73
    new-instance v6, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8$1;

    .line 74
    .line 75
    iget-object v7, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->this$0:Lexpo/modules/imagepicker/ImagePickerModule;

    .line 76
    .line 77
    invoke-direct {v6, v7}, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8$1;-><init>(Lexpo/modules/imagepicker/ImagePickerModule;)V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object v1, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->L$1:Ljava/lang/Object;

    .line 83
    .line 84
    iput v4, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->label:I

    .line 85
    .line 86
    invoke-interface {p1, v5, v6, p0}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;->registerForActivityResult(Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Ln7/f;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    if-ne v4, v0, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    move-object v8, v4

    .line 94
    move-object v4, p1

    .line 95
    move-object p1, v8

    .line 96
    :goto_0
    check-cast p1, Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 97
    .line 98
    invoke-static {v1, p1}, Lexpo/modules/imagepicker/ImagePickerModule;->access$setCameraLauncher$p(Lexpo/modules/imagepicker/ImagePickerModule;Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;)V

    .line 99
    .line 100
    .line 101
    iget-object v1, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->this$0:Lexpo/modules/imagepicker/ImagePickerModule;

    .line 102
    .line 103
    new-instance p1, Lexpo/modules/imagepicker/contracts/ImageLibraryContract;

    .line 104
    .line 105
    invoke-direct {p1, v1}, Lexpo/modules/imagepicker/contracts/ImageLibraryContract;-><init>(Lexpo/modules/kotlin/providers/AppContextProvider;)V

    .line 106
    .line 107
    .line 108
    new-instance v5, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8$2;

    .line 109
    .line 110
    iget-object v6, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->this$0:Lexpo/modules/imagepicker/ImagePickerModule;

    .line 111
    .line 112
    invoke-direct {v5, v6}, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8$2;-><init>(Lexpo/modules/imagepicker/ImagePickerModule;)V

    .line 113
    .line 114
    .line 115
    iput-object v4, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->L$0:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v1, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->L$1:Ljava/lang/Object;

    .line 118
    .line 119
    iput v3, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->label:I

    .line 120
    .line 121
    invoke-interface {v4, p1, v5, p0}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;->registerForActivityResult(Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Ln7/f;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-ne p1, v0, :cond_5

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_5
    move-object v3, v4

    .line 129
    :goto_1
    check-cast p1, Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 130
    .line 131
    invoke-static {v1, p1}, Lexpo/modules/imagepicker/ImagePickerModule;->access$setImageLibraryLauncher$p(Lexpo/modules/imagepicker/ImagePickerModule;Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->this$0:Lexpo/modules/imagepicker/ImagePickerModule;

    .line 135
    .line 136
    new-instance v1, Lexpo/modules/imagepicker/contracts/CropImageContract;

    .line 137
    .line 138
    invoke-direct {v1, p1}, Lexpo/modules/imagepicker/contracts/CropImageContract;-><init>(Lexpo/modules/kotlin/providers/AppContextProvider;)V

    .line 139
    .line 140
    .line 141
    new-instance v4, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8$3;

    .line 142
    .line 143
    iget-object v5, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->this$0:Lexpo/modules/imagepicker/ImagePickerModule;

    .line 144
    .line 145
    invoke-direct {v4, v5}, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8$3;-><init>(Lexpo/modules/imagepicker/ImagePickerModule;)V

    .line 146
    .line 147
    .line 148
    iput-object p1, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->L$0:Ljava/lang/Object;

    .line 149
    .line 150
    const/4 v5, 0x0

    .line 151
    iput-object v5, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->L$1:Ljava/lang/Object;

    .line 152
    .line 153
    iput v2, p0, Lexpo/modules/imagepicker/ImagePickerModule$definition$1$8;->label:I

    .line 154
    .line 155
    invoke-interface {v3, v1, v4, p0}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;->registerForActivityResult(Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Ln7/f;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    if-ne v1, v0, :cond_6

    .line 160
    .line 161
    :goto_2
    return-object v0

    .line 162
    :cond_6
    move-object v0, p1

    .line 163
    move-object p1, v1

    .line 164
    :goto_3
    check-cast p1, Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 165
    .line 166
    invoke-static {v0, p1}, Lexpo/modules/imagepicker/ImagePickerModule;->access$setCropImageLauncher$p(Lexpo/modules/imagepicker/ImagePickerModule;Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;)V

    .line 167
    .line 168
    .line 169
    sget-object p1, Li7/B;->a:Li7/B;

    .line 170
    .line 171
    return-object p1
.end method
