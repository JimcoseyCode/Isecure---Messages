.class final Lc8/g$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LC8/S;

.field private final b:I


# direct methods
.method public constructor <init>(LC8/S;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc8/g$a;->a:LC8/S;

    .line 5
    .line 6
    iput p2, p0, Lc8/g$a;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lc8/g$a;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()LC8/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lc8/g$a;->a:LC8/S;

    .line 2
    .line 3
    return-object v0
.end method
