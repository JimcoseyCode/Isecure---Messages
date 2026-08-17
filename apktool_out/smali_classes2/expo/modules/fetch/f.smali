.class public final synthetic Lexpo/modules/fetch/f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/fetch/f;->g:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/fetch/f;->h:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/fetch/f;->g:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/fetch/f;->h:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    check-cast p1, Lexpo/modules/fetch/ResponseState;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lexpo/modules/fetch/NativeResponse;->d(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lexpo/modules/fetch/ResponseState;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
