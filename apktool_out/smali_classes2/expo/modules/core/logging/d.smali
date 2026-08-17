.class public final synthetic Lexpo/modules/core/logging/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# instance fields
.field public final synthetic g:Lexpo/modules/core/logging/PersistentFileLog;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/core/logging/PersistentFileLog;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/core/logging/d;->g:Lexpo/modules/core/logging/PersistentFileLog;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/core/logging/d;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lexpo/modules/core/logging/d;->i:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/core/logging/d;->g:Lexpo/modules/core/logging/PersistentFileLog;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/core/logging/d;->h:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/core/logging/d;->i:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lexpo/modules/core/logging/PersistentFileLog;->b(Lexpo/modules/core/logging/PersistentFileLog;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Li7/B;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
