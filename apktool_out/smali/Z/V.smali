.class public final synthetic LZ/V;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LZ/S$j$d;


# instance fields
.field public final synthetic a:LZ/s;

.field public final synthetic b:Landroid/os/ParcelFileDescriptor;


# direct methods
.method public synthetic constructor <init>(LZ/s;Landroid/os/ParcelFileDescriptor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ/V;->a:LZ/s;

    .line 5
    .line 6
    iput-object p2, p0, LZ/V;->b:Landroid/os/ParcelFileDescriptor;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(ILH0/a;)Landroid/media/MediaMuxer;
    .locals 2

    .line 1
    iget-object v0, p0, LZ/V;->a:LZ/s;

    .line 2
    .line 3
    iget-object v1, p0, LZ/V;->b:Landroid/os/ParcelFileDescriptor;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, LZ/S$j;->k(LZ/s;Landroid/os/ParcelFileDescriptor;ILH0/a;)Landroid/media/MediaMuxer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
