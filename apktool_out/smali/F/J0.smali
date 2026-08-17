.class public final synthetic LF/J0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/util/Map$Entry;

.field public final synthetic h:LF/Q0$a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;LF/Q0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF/J0;->g:Ljava/util/Map$Entry;

    .line 5
    .line 6
    iput-object p2, p0, LF/J0;->h:LF/Q0$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LF/J0;->g:Ljava/util/Map$Entry;

    .line 2
    .line 3
    iget-object v1, p0, LF/J0;->h:LF/Q0$a;

    .line 4
    .line 5
    invoke-static {v0, v1}, LF/Q0;->f(Ljava/util/Map$Entry;LF/Q0$a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
