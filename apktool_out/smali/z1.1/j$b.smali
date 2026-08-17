.class final Lz1/j$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LR1/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz1/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field final g:Ljava/security/MessageDigest;

.field private final h:LR1/c;


# direct methods
.method constructor <init>(Ljava/security/MessageDigest;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LR1/c;->a()LR1/c;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lz1/j$b;->h:LR1/c;

    .line 9
    .line 10
    iput-object p1, p0, Lz1/j$b;->g:Ljava/security/MessageDigest;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public m()LR1/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lz1/j$b;->h:LR1/c;

    .line 2
    .line 3
    return-object v0
.end method
